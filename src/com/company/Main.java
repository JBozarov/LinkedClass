package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    Customer cust1 = new Customer("John", 499.99);
        System.out.println("Customer 1 is " + cust1.getName() + " " + cust1.getBalance()); // Customer 1 is John 499.99

        Customer cust2 = cust1; // creating memory referenct not new object
        cust2.setBalance(2.99); // updating memory for both because there is only one value
        System.out.println("Customer 2 is " + cust2.getName() + " " + cust2.getBalance()); // Customer 2 is John 2.99
        System.out.println("Customer 1 is " + cust1.getName() + " " + cust1.getBalance()); // Customer 1 is John 2.99



        // ArrayList

        ArrayList<Integer> myIntList = new ArrayList<Integer>();
        for (int i = 1; i<=5; i++ ) {
            myIntList.add(i*10);
        }

        listMapper(myIntList); //10 20 30 40 50
        myIntList.add(2, 2222);
        listMapper(myIntList); // 10 20 2222 30 40 50
        myIntList.remove(3);
        listMapper(myIntList); // 10 20 2222 40 50




    }

    public static void listMapper(ArrayList list) {
        for ( int j = 0; j<list.size(); j++ ) {
            System.out.println(list.get(j));
        }
    }

}
