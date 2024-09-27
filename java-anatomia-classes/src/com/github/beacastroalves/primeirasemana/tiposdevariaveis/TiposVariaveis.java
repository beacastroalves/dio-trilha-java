package com.github.beacastroalves.primeirasemana.tiposdevariaveis;

public class TiposVariaveis {
  public static void main(String[] args) {
    byte idade = 13;
    short ano = 2011;
    int cep = 60416000;
    long cpf = 987654321L;
    float pi = 3.14F;
    double salario = 12345.45;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    numeroNormal = 32;
    short numeroCurto2 = (short) numeroNormal;

    System.out.println("idade: " + idade);
    System.out.println("ano: " + ano);
    System.out.println("Cep: " + cep);
    System.out.println("cpf: " + cpf);
    System.out.println("pi: " + pi);
    System.out.println("salario: " + salario);

    System.out.println("-----------------");

    System.out.println("numeroCurto1: " + numeroCurto);
    System.out.println("numeroNormal: " + numeroNormal);
    System.out.println("numeroCurto2: " + numeroCurto2);
  }
}
