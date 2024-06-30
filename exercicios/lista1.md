Claro! Aqui está uma lista de 15 exercícios baseados no artigo "Introdução aos Java Streams":

### Lista de Exercícios sobre Introdução aos Java Streams

1. **Criação de Streams:**
    - Crie um `Stream` a partir de uma lista de nomes e imprima todos os nomes usando a operação terminal `forEach`.

2. **Filtragem de Dados:**
    - Use `Stream.filter` para filtrar os nomes que começam com a letra "J" e imprima-os.

3. **Transformação de Dados:**
    - Utilize `Stream.map` para converter todos os nomes para letras maiúsculas e imprima o resultado.

4. **Contagem de Elementos:**
    - Conte quantos nomes na lista começam com a letra "A" usando `Stream.filter` e `Stream.count`.

5. **Ordenação de Dados:**
    - Use `Stream.sorted` para ordenar os nomes em ordem alfabética e imprima-os.

6. **Coleta de Dados:**
    - Converta o `Stream` de nomes em uma lista utilizando `Stream.collect(Collectors.toList())`.

7. **Criação de um Stream a partir de um Array:**
    - Crie um `Stream` a partir de um array de inteiros e imprima todos os elementos.

8. **Uso de `Stream.distinct`:**
    - Crie um `Stream` de inteiros com valores duplicados, use `Stream.distinct` para remover duplicatas e imprima os valores únicos.

9. **Operações Paralelas:**
    - Crie um `parallelStream` a partir de uma lista de nomes e use `forEach` para imprimi-los.

10. **Redução de Dados:**
    - Use `Stream.reduce` para somar todos os números em um `Stream` de inteiros.

11. **Verificação de Condições:**
    - Utilize `Stream.anyMatch` para verificar se algum nome na lista começa com "B".

12. **Transformação e Coleta de Dados:**
    - Use `Stream.map` para adicionar "Olá, " antes de cada nome e depois use `Collectors.joining(", ")` para juntar todos os nomes em uma única string.

13. **Uso de `Stream.peek`:**
    - Crie um `Stream` de nomes, utilize `peek` para imprimir cada nome à medida que passa pelo `Stream`, e depois filtre os nomes que começam com "C".

14. **Trabalhando com Optional:**
    - Use `Stream.findFirst` para encontrar o primeiro nome que começa com "D" e imprimir o valor, se presente.

15. **Lazy Evaluation:**
    - Crie um `Stream` que filtre os nomes que começam com "E", converta-os para letras maiúsculas, e utilize `peek` para imprimir o nome antes e depois da conversão. Verifique se as operações intermediárias são executadas somente quando a operação terminal `forEach` é chamada.

---

### Exemplos de Código

#### Exercício 1
```java
List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos", "Daniela");
nomes.stream().forEach(System.out::println);
```

#### Exercício 2
```java
nomes.stream()
     .filter(nome -> nome.startsWith("J"))
     .forEach(System.out::println);
```

#### Exercício 3
```java
nomes.stream()
     .map(String::toUpperCase)
     .forEach(System.out::println);
```

#### Exercício 4
```java
long count = nomes.stream()
                  .filter(nome -> nome.startsWith("A"))
                  .count();
System.out.println(count);
```

#### Exercício 5
```java
nomes.stream()
     .sorted()
     .forEach(System.out::println);
```

#### Exercício 6
```java
List<String> listaNomes = nomes.stream()
                               .collect(Collectors.toList());
System.out.println(listaNomes);
```

#### Exercício 7
```java
Integer[] numeros = {1, 2, 3, 4, 5};
Arrays.stream(numeros)
      .forEach(System.out::println);
```

#### Exercício 8
```java
List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
numeros.stream()
       .distinct()
       .forEach(System.out::println);
```

#### Exercício 9
```java
nomes.parallelStream()
     .forEach(System.out::println);
```

#### Exercício 10
```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
int soma = numeros.stream()
                  .reduce(0, Integer::sum);
System.out.println(soma);
```

#### Exercício 11
```java
boolean anyMatch = nomes.stream()
                        .anyMatch(nome -> nome.startsWith("B"));
System.out.println(anyMatch);
```

#### Exercício 12
```java
String resultado = nomes.stream()
                        .map(nome -> "Olá, " + nome)
                        .collect(Collectors.joining(", "));
System.out.println(resultado);
```

#### Exercício 13
```java
nomes.stream()
     .peek(nome -> System.out.println("Antes: " + nome))
     .filter(nome -> nome.startsWith("C"))
     .peek(nome -> System.out.println("Depois: " + nome))
     .forEach(System.out::println);
```

#### Exercício 14
```java
Optional<String> nomeOptional = nomes.stream()
                                     .filter(nome -> nome.startsWith("D"))
                                     .findFirst();
nomeOptional.ifPresent(System.out::println);
```

#### Exercício 15
```java
nomes.stream()
     .filter(nome -> nome.startsWith("E"))
     .peek(nome -> System.out.println("Filtrado: " + nome))
     .map(String::toUpperCase)
     .peek(nome -> System.out.println("Convertido: " + nome))
     .forEach(System.out::println);
```

---

Espero que esses exercícios ajudem a solidificar o entendimento sobre Java Streams!