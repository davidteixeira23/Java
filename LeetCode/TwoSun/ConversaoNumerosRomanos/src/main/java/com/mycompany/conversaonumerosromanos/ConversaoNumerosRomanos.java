package com.mycompany.conversaonumerosromanos;

import java.util.Scanner;

public class ConversaoNumerosRomanos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        Calculo calculo = new Calculo();

        String romano = calculo.intToRoman(numero);

        System.out.println("Número romano: " + romano);

        sc.close();
    }
}