/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.io.*;
import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {

        float numA, numB, mostrar;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        numA = ler.nextFloat();
        System.out.println("Digite outro numero: ");
        numB = ler.nextFloat();
        Operacoes calcula = new Operacoes();
        mostrar = calcula.soma(numA, numB);
        System.out.println("A soma deu: " +mostrar);
        mostrar = calcula.subtrai(numA, numB);
        System.out.println("A subtracao deu: " +mostrar);
        mostrar = calcula.multiplica(numA, numB);
        System.out.println("A multiplicacao deu: " +mostrar);
        mostrar = calcula.dividir(numA, numB);
        System.out.println("A divisao deu: " +mostrar);

    }

}
