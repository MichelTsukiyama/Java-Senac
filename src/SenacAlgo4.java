public class SenacAlgo4 {
    
    public static void main (String[] args){

        int[] v = {4, 1, 5, -6, 45, 2, 64, 12};
        int maior = v[0];
        int menor = v[0];

        for(int i = 1; i < v.length; i++) {
            if(maior < v[i]) {
                maior = v[i];
            }
        }
        
        for(int j = 1; j < v.length; j++) {
            if(menor > v[j]) {
                menor = v[j];
            }
        }

        int diferenca = maior - menor;


    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
    System.out.println("Diferença: " + diferenca);

    }

}
