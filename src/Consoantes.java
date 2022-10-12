import java.util.Scanner;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoates =0;

        int contador = 0;

        do{
            System.out.println("Letra: ");
            String letra = scanner.next();

            if(!(letra.equalsIgnoreCase("a")|
                letra.equalsIgnoreCase("e")|
                letra.equalsIgnoreCase("i")|
                letra.equalsIgnoreCase("o")|
                letra.equalsIgnoreCase("u")) ) {

                consoantes[contador] = letra;
                quantConsoates++;
            }
            contador++;

        }while ((contador < consoantes.length));

        for(String consoante : consoantes){
            if(consoante != null){
                System.out.print(consoante+ " ");
            }
        }
        System.out.println("Quantidade de consoantes: " + quantConsoates);

    }
}
