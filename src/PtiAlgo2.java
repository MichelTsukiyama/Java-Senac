import java.util.Scanner;
import java.util.Arrays;

public class PtiAlgo2 {

    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in); //Entrada de dados
        System.out.println("Digite quantos elementos terá o vetor: ");

        int tamanhoVetor = teclado.nextInt(); 
        int[] vetor = new int [tamanhoVetor];

        for(int i = 0; i < vetor.length; i++) { //Guarda os números digitados em indices diferentes
            System.out.println("Digite o " + (i+1) + "º elemento: " );
            vetor[i] = teclado.nextInt();
        }

        System.out.println("Seu vetor é: " + Arrays.toString(vetor)); //Informa todos os elementos do vetor
        
        int diferenca = maiorDiferenca(vetor); //chama o método maiorDiferença
        System.out.println("A maior diferença entre 2 elementos distintos é: " + diferenca);

        boolean ordem = verificarOrdem(vetor); //chama o método verificarOrdem
        System.out.println("O vetor está em ordem crescente? " + ordem);
    }

    public static int maiorDiferenca(int[] elemento) { // calcula a maior diferença entre 2 elementos
        int maior = elemento[0];
        int menor = elemento[0];

        for(int i = 0; i < elemento.length - 1; i++) {
            if(maior < elemento[i + 1]){
                maior = elemento[i + 1];
            }

            if(menor > elemento[i + 1]) {
                menor = elemento[i + 1];
            }
        }

        int dif = maior - menor;
        return dif;        
    }

    public static boolean verificarOrdem(int[] elemento){ // verifica se a ordem do vetor é crescente
        int contador = 0;

        for(int i = 0; i < elemento.length - 1; i++){
            if(elemento[i] <= elemento[i + 1]){
                contador++;
            }
        }
        
        if(contador == elemento.length - 1){
            return true;
        } else 
            return false;
    }       
}