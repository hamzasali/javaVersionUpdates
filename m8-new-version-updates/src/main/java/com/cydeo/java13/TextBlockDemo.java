package com.cydeo.java13;

public class TextBlockDemo {
    public static void main(String[] args) {

        var address = "7999 Jones beach Dr \n" +
                "Jones Beach, NY 11123";

        System.out.println(address);

        var address2 = """
                4999 Jones beach Dr
                Jones Beach, NY 11123
                """;

        System.out.println(address2);
    }
}
