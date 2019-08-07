package com.inteview.question.java8;

import java.io.*;

public class SerializationDeSerializationExample {


    public static void main(String[] args) {
        serialize();
        deSerialize();

    }


    private static void deSerialize() {
        try {
            String fileName = "first.ser";
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream oin = new ObjectInputStream(fis);
            Demo object1 = (Demo) oin.readObject();
            System.out.println(object1.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void serialize() {
        String fileName = "first.ser";
        ObjectOutputStream oos;


        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            Demo d = new Demo(1, "Suresh");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class Demo implements Serializable {
    public int a;
    public String b;

    Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}