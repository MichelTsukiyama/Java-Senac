
public class SenacAlgo1 {
    //busca sequencial
    static int[] vetor = {12, 23, 14, 56, 9, 57, -5};

    public static void main (String[] args){

        System.out.println("Indice:" + busca(57));
        
    }
    
    static int busca(int elemento) {

        for(int i = 0; i < vetor.length; i++) {
            if(elemento == vetor[i]) {
                return i;
            }

        }

        return -1;
    }
}
