package com.practicaljava.lesson7;

/**
 * Created by vladimir on 26.06.17.
 */
public class Employee  implements Payable{
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by " + percent
                            + "%: " + name);
        return true;
    }
}
