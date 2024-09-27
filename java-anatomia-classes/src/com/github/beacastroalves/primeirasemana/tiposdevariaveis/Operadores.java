package com.github.beacastroalves.primeirasemana.tiposdevariaveis;

public class Operadores {
  public static void main(String[] args) {
    System.out.println(" ---- Operador de Incremento e Decremento ---- ");

    int numeroIncremento = 5;
    int numeroDecremento = 8;

    System.out.println("Incremento");
    System.out.println(numeroIncremento++);
    System.out.println(numeroIncremento);
    System.out.println(++numeroIncremento);
    System.out.println(numeroIncremento);

    System.out.println("Decremento");
    System.out.println(numeroDecremento--);
    System.out.println(numeroDecremento);
    System.out.println(--numeroDecremento);
    System.out.println(numeroDecremento);
    System.out.println("");

    System.out.println(" ---- Operador de inversão ! ---- ");

    boolean variavel = true;
    System.out.println("Invertendo a variavel, original true");
    System.out.println(variavel);
    System.out.println(!variavel);

    variavel = !variavel;
    System.out.println("Invertendo a variavel, original false");
    System.out.println(variavel);
    System.out.println(!variavel);
    System.out.println("");
    System.out.println("");

    System.out.println(" ---- Operadores Ternarios ---- ");
    int a, b;
    a = 6;
    b = 7;

    String resultado = a==b ? "verdadeiro" : "falso";
    System.out.println(resultado);

    a = 8;
    b = 8;
    String resultado2 = a==b ? "verdadeiro" : "falso";
    System.out.println(resultado2);
    System.out.println("");


    System.out.println(" ---- Operadores Relacionais ---- ");
    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;
    System.out.println("numero1 é igual ao numero2? " + simNao);

    simNao = numero1 != numero2;
    System.out.println("numero1 é diferente do numero2? " + simNao);

    simNao = numero1 < numero2;
    System.out.println("numero1 é menor que numero2? " + simNao);

    simNao = numero1 <= numero2;
    System.out.println("numero1 é menor ou igual ao numero2? " + simNao);

    simNao = numero1 > numero2;
    System.out.println("numero1 é maior que numero2? " + simNao);

    simNao = numero1 >= numero2;
    System.out.println("numero1 é maior ou igual ao numero2? " + simNao);


    String nomeUm = "Beatriz";
    String nomeDois = new String("Beatriz");

    System.out.println("Usando o operador ==: nomeUm é == ao nomeDois? " + (nomeUm == nomeDois));
    System.out.println("Usando o .equals():  nomeUm é equals ao nomeDois? " + (nomeUm.equals(nomeDois)));
  }
}
