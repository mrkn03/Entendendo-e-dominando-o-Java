package Exercicios_Arrays;

/*
Escreva um programa que, a partir de um universo de numeros de 1 a 60 gere e imprima 10 sequencias aleatorias de 6
numeros e os armazene em uma matriz com 10 linhas e 6 colunas.
 */

public class Exercicio_Basico {
    public static void main(String[] args) {

        int mat[][] = new int[10][6];

        for(int i=0; i<10; i++) {
            for(int j=0; j<6; j++) {
                mat[i][j] = (int)((Math.random()*59)+1);
            }
        }
        System.out.println("Matriz gerada: ");
        for(int i=0; i<10; i++) {
            for(int j=0; j<6; j++) {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
