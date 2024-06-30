package com.porto.tema1;

import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        Integer[] numeros = {10, 20, 30, 40, 50};
        Arrays.stream(numeros)
                .forEach(System.out::println);
    }
}
