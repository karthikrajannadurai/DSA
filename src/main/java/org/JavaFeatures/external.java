package org.JavaFeatures;

import java.io.*;

public class external {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("file.dat"));
        externalization externalization = new externalization();
        externalization.setId(12);
        externalization.setEmpId("Emp_90");
        objectOutput.writeObject(externalization);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("file.dat"));
        externalization externalization1 = (externalization) objectInputStream.readObject();
        System.out.println(externalization1.getId());
    }
}

class externalization implements Externalizable {

    private int id;
    private String empId;

    public externalization() {
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(empId);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        empId = (String) in.readObject();
    }
}
