package com.porto.tema1;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<String> objetos = Arrays.asList("cadeira", "arame", "mesa", "atadura", "parede");
        int qtdObjetosComA = (int) objetos.stream()
                .filter((e) -> e.startsWith("a"))
                .count();

        System.out.println(qtdObjetosComA);
    }
}
