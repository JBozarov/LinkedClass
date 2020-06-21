package com.company;

import java.util.LinkedList;

public class LinkListDemo {

    public static void main(String[] args) {
        LinkedList<String> foods = new LinkedList<String>();
        foods.add("Banana");
        foods.add("Apple");
        foods.add("Orange");
        foods.add("Chocolate");
    }


    public static void printer(LinkedList someList){
        for ( int i = 0; i<someList.size(); i++ ) {
            System.out.println("Array list is " + someList.get(i) );
        }
    }
}
