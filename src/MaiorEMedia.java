import java.util.Scanner;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int i = 0;
        int maior = 0;
        double media =0;

        do{
            System.out.println("Digite um número:");
            numero = scan.nextInt();

            media = media + numero;

            if(numero > maior ) maior = numero;

            i++;

        } while(i < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + media/5);
        System.out.println("Encerrando... ");

    }
}
