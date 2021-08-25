import java.util.Scanner;
import java.io.*;

public class logica {
    
    public static void main (String[] args) {
        System.out.println("Olá mundo!");

        String nome = "Teste";
        int idade = 20;
        double numeroAleatorio = 35.54;

        System.out.println("Nome: " + nome + " Idade: " + idade + " Any: " + numeroAleatorio);

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        
        try {
            nome = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("O nome digitado foi "+ nome);
    }
}
