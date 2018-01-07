package com.example.set;

import java.util.ArrayList;

public class Set {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    int size = 0;

    public static void main(String[] args) {
        Set x = new Set();
        x.addElement(10);
        x.addElement(10);
        System.out.println(x.numbers);
    }

    public void addElement(int element) {
        if (doesContain(element)) {
            numbers.add(element);
       }
    }


    public Boolean doesContain(int element) {

        if (this.numbers.size() == 0) {
            return true;
        } else for (int i = 0; i <= this.numbers.size(); i++) {
                    if (this.numbers.contains(element)) {
                        return false;
                    } else {
                        return true;
                    }
        }
        return true;
    }
}
