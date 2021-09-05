import java.util.Arrays;

public class SenacAlgo3 {

    public static void main (String[] args){

        int[] v = {12, 3, 1, -9, 4, 1};

        int aux;

        for(int j = 0; j < v.length - 1; j++) {
            for(int i = 0; i < v.length - 1; i++){
                if(v[i] > v[i + 1]) {
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(v));
    }
    
}
