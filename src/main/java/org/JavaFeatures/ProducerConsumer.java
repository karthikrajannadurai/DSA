package org.JavaFeatures;

class Data {

    private int  data;
    private boolean isValueSet = false;

    public synchronized void getData() {

        while (!isValueSet) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Consume" + this.data);
        isValueSet = false;
        notify();
    }

    public synchronized void setData(int data) {

        while (isValueSet) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Produce" + data);
        this.data = data;
        isValueSet = true;
        notify();
    }
}

class Producer extends Thread {

    Data data;

    Producer(Data data) {
        this.data = data;
        Thread thread = new Thread(this);
        thread.start();
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            data.setData(i++);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {

    Data data;

    Consumer(Data data) {
        this.data = data;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            data.getData();
            i++;
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {

        Data data = new Data();
        Producer producer = new Producer(data);
        Thread consumer = new Thread(new Consumer(data));

    }
}
