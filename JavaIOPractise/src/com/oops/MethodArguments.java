package com.oops;

import java.util.ArrayList;

public class MethodArguments {

public static void main(String args[]) {

    ArrayList<String> a = new ArrayList<String>();

    a.add("Steve");
    a.add("Daniel");
    a.add("John");
    a.add("Maxi");
    a.add("Jeni");

    System.out.println(a);

   // display(a);
    display(new ArrayList<String>());

    getSize(a);


}

static void display(ArrayList<String> arrayList1) {

    arrayList1.add("Pollard");

    System.out.println(arrayList1); // passing the arraylist values and
                                    // adding the element

}

static void getSize(ArrayList<String> arrayList1) {

    System.out.println(arrayList1.size()); // getting the size of arraylist
                                            // by passing arguments to
                                            // method
 }

}
