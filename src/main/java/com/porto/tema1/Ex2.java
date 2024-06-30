package com.porto.tema1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("uva", "maçã", "amora", "melão");
        List<String> frutasIniciamComA = frutas
                .stream()
                .filter((e -> e.startsWith("a")))
                .collect(Collectors.toList());

        System.out.println(frutasIniciamComA);
    }
}
