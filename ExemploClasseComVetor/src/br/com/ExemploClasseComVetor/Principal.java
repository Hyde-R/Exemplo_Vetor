package br.com.ExemploClasseComVetor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String nome, buscar;
        int matricula, i;
        Aluno[] alunos = new Aluno[10];
        Scanner sc = new Scanner(System.in);

        for(i=0; i<2; i++){
            System.out.println("Digite matrícula: ");
            matricula = sc.nextInt();
            System.out.println("Digite nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            alunos[i] = new Aluno(nome, matricula);
        }

        for(i = 0; i<2; i++){
            System.out.println(alunos[i].mostrar());
        }

        System.out.println("Digite um nome para buscar: ");
        buscar = sc.nextLine();
        for(i = 0; i<2; i++){
            if(alunos[i].getNome().equals(buscar)){
                System.out.println("Nome encontrado com sucesso!");
            }
        }

        sc.close();
    }
}