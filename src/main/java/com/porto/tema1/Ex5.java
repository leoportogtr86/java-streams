package com.porto.tema1;

import java.util.Arrays;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("agua", "urubu", "carro", "vaca", "amolar");
        List<String> ordenados = palavras.stream()
                .sorted()
                .toList();

        System.out.println(ordenados);
    }
}
