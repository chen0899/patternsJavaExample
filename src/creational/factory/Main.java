package creational.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        ToysFactory toys = new FactoryProcessor().getFactory(input);
        toys.setCountry();
        toys.setType();
    }
}
