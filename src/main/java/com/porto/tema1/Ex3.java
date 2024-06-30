package com.porto.tema1;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> cidades = Arrays.asList("São Paulo", "João Pessoa", "Cuiabá");
        List<String> cidadesLetrasMaiusculas = cidades
                .stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(cidadesLetrasMaiusculas);
    }
}
