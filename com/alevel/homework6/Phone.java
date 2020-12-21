package com.alevel.homework6;

public class Phone {
    long number;
    String model;
    double weight;

    public static void main(String[] args) {
        Phone Samsung = new Phone();
        Samsung.number = 123456789L;
        Samsung.model = "Samsung";
        Samsung.weight = 0.183;
        Phone Iphone = new Phone();
        Iphone.number = 123456788L;
        Iphone.model = "Iphone";
        Iphone.weight = 0.190;
        Phone Nokia = new Phone();
        Nokia.number = 123456787L;
        Nokia.model = "Nokia";
        Nokia.weight = 0.186;
        System.out.println(Samsung.getNumber());
        System.out.println(Nokia.receiveCall());
        String Name = Iphone.receiveCall();
        System.out.println("Name = " + Name);
        Phone Xiaomi = new Phone(123456L, "Xiaomi");
        System.out.println(Xiaomi.getNumber());
        Phone Unknown = new Phone();
        System.out.println(Unknown.receiveCall());

    }



    Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {
    }


    long getNumber() {
        return number;
    }

    String receiveCall() {
        if (number == 123456789L) {

            return "Michael";
        }
        if (number == 123456788L) {

            return "Masha";
        }
        if (number == 123456787L) {

            return "Lena";
        }

        return "Unknown call";

    }
}












