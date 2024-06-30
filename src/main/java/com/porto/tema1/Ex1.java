package com.porto.tema1;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Bruna", "Juca", "Joe", "Mary");

        nomes
                .forEach(System.out::println);
    }
}
