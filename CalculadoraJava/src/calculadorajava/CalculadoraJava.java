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
        System.out.println("1 - soma");
        System.out.println("2 - subtracao");
        System.out.println("3 - multiplicao");
        System.out.println("4 - divisao");
        int opcao = scan.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("");
                System.out.println("A soma é: "+soma(scan.nextInt(), scan.nextInt()));
        }

    }

}
