package org.JavaFeatures;

import java.io.*;

public class Serial {

    public static void main(String[] args) throws IOException {

        try (FileOutputStream file = new FileOutputStream("./file.dat")) {

            Employee karthik = new Employee();
            karthik.setEmployee_id("1234");
            karthik.setName("Karthik");
            // write object
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
            objectOutputStream.writeObject(karthik);
            // read object
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("./file.dat"));
            Employee obj = (Employee) objectInputStream.readObject();
            System.out.println(obj.getName());
            System.out.println(karthik.hashCode());
            System.out.println(obj.hashCode());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

class Employee implements Serializable {

    // To version the object.
    private static final long SerialVersionUUID = 2L;

    private String name;
    private String employee_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
}
