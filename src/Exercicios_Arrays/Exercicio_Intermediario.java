package Exercicios_Arrays;

/*
Retome o exercicio anterior (Basico) e adicione a ele linhas de codigo utilizando estruturas de repetição e comparaçao,
para ordenar os números gerados dentro da matriz.
 */

public class Exercicio_Intermediario {
    public static void main(String[] args) {

        int mat[][] = new int[10][6];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                mat[i][j] = (int) ((Math.random() * 59)+1);
            }
        }
        for(int i = 0; i < 10; i++){
            java.util.Arrays.sort(mat[i]);
        }
        System.out.println("Matriz gerada:");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(mat[i][j]+" \t");
            }
            System.out.println();
        }
    }
}
