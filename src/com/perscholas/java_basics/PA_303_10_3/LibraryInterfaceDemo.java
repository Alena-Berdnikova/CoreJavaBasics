package com.perscholas.java_basics.PA_303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kidUser = new KidUser();
        kidUser.setAge(10);
        kidUser.setBookType("Kids");
        kidUser.registerAccount();
        kidUser.requestBook();

        KidUser kidUser2 = new KidUser();
        kidUser2.setAge(18);
        kidUser2.setBookType("Fiction");
        kidUser2.registerAccount();
        kidUser2.requestBook();

        AdultUser adultUser = new AdultUser();
        adultUser.setAge(5);
        adultUser.setBookType("Kids");
        adultUser.registerAccount();
        adultUser.requestBook();

        AdultUser adultUser2 = new AdultUser();
        adultUser2.setAge(23);
        adultUser2.setBookType("Fiction");
        adultUser2.registerAccount();
        adultUser2.requestBook();
    }
}
