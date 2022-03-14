/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class CalculadoraJava {

    public int soma(int nm1, int nm2) {
        return nm1 + nm2;
    }

    public int subtracao(int nm1, int nm2) {
        return nm1 - nm2;
    }

    public int multiplicao(int nm1, int nm2) {
        return nm1 * nm2;
    }

    public int divisao(int nm1, int nm2) {
        return nm1 / nm2;
    }

    public void escolha() {
        Scanner scan = new Scanner(System.in);
        System.out.println("+ soma");
        System.out.println("- subtracao");
        System.out.println("* multiplicao");
        System.out.println("/ divisao");
        String opcao = scan.next();

        switch (opcao) {
            case "+":
                System.out.println("");
                System.out.println("Soma");
                System.out.println("A soma é: " + soma(scan.nextInt(), scan.nextInt()));
                break;
            case "-":
                System.out.println("");
                System.out.println("Subtracao");

                System.out.println("A subtracao é: " + subtracao(scan.nextInt(), scan.nextInt()));
                break;
            case "*":
                System.out.println("");
                System.out.println("multiplicao");

                System.out.println("A multiplicao é: " + multiplicao(scan.nextInt(), scan.nextInt()));
                break;
            case "/":
                System.out.println("");
                System.out.println("divisao");

                System.out.println("A divisao é: " + divisao(scan.nextInt(), scan.nextInt()));
                break;
            default:
                System.out.println("Opção inválida");
        }

    }

}
