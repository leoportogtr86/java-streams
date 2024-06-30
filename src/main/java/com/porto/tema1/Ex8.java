package com.porto.tema1;

import java.util.Arrays;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 10, 20, 20, 30, 30, 40, 40);
        List<Integer> unicos = numeros
                .stream()
                .distinct()
                .toList();

        System.out.println(unicos);
    }
}
