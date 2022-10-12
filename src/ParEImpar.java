import java.util.Scanner;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class ParEImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantPares =0, quantImpares=0;

        System.out.println("quantidade de numeros: ");
        quantidadeNumeros = sc.nextInt();

        int contador = 0;

        do{
            System.out.println("Número :");
            numero = sc.nextInt();
            if(numero % 2 == 0){
                quantPares++;
            } else {
                quantImpares++;
            }

            contador++;
        } while(contador < quantidadeNumeros);

        System.out.println("Quantidade de pares: " + quantPares);
        System.out.println("Quantidade de impares: " + quantImpares);

    }
}
