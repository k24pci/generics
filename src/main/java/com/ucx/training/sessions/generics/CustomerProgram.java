package com.ucx.training.sessions.generics;

import java.util.Map;

public class CustomerProgram {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"Customer Name");

        FileUpload fileUpload = new FileUpload("3j432jek", "FileUpload Name");

        System.out.println(customer);
        System.out.println(fileUpload);

        Double number = 100D;

        System.out.println(Util.isEven(number));

        Map<Integer, String> map;

    }
}
