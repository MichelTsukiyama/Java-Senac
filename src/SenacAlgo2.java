import java.util.Scanner;

public class SenacAlgo2 {

    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in); // entrada
        System.out.println("Escolha o tamanho do vetor: ");
        int tamanho = teclado.nextInt();
        int[] v = new int [tamanho];

        for(int i = 0; i < v.length; i++){
            System.out.println("Digite um número: ");
        v[i] = teclado.nextInt();
        }
        
        for (int i = 0; i < v.length; i++) {
        System.out.println(v[i]);

        }
        
    }
}
