/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class OrdemInversa {
    public static void main(String[] args) {

        int [] vetor = {4,12,-6,7,-20,6};

        System.out.print("Vetor: ");
        int contador = 0;
        while(contador < (vetor.length)){
            System.out.print(vetor[contador]+ " ");
            contador++;
        }
        System.out.print("\nVetor: ");
        for(int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i]+ " ");
        }


    }
}
