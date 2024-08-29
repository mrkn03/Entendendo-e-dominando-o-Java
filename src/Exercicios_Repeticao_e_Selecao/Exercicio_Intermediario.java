package Exercicios_Repeticao_e_Selecao;

/*
Escreva um programa que imprima na tela um volante de jogo da Mega Sena, com a seguinte aparencia:
1   2   3   4   5   6   7   8   9   10
11  12  13  14  15  16  17  18  19  20
21  22  23  24  25  26  27  28  29  30
31  32  33  34  35  36  37  38  39  40
41  42  43  44  45  46  47  48  49  50
51  52  53  54  55  56  57  58  59  60
 */

public class Exercicio_Intermediario {
    public static void main(String[] args) {

        for (int i = 1; i <= 60 ; i++) {
            System.out.print(i + "\t");
            if(i % 10 ==0){
                System.out.println();
            }
        }

    }
}
