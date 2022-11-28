package com.syntax.class25;

import java.util.ArrayList;
import java.util.List;

public class ArrayListmMethods {
    public static void main(String[] args) {
        List<String> cosmetics=new ArrayList<>();
        cosmetics.add("Dove soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("lotion");
        cosmetics.clear();
        cosmetics.removeAll(cosmetics);
    }
}
