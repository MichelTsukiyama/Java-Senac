public class SenacAula3 {
    
    public static void main (String args[]) {
        int contador = 0;
        int contador2 = 0;
        int contador3 = 0;

        for(contador = 0; contador < 5; contador ++){

            System.out.println(contador + " Eu nunca mais vou copiar o código do colega ao lado...");
        }

        while(contador2 < 5) {

            System.out.println(contador2 + " Eu nunca....");

            contador2 ++;
        }

        do{
            System.out.println(contador3 + "Eu...");
            if(contador3 == 3){
                break;
                //continue; 
            }

            contador3 ++;
        }while(contador3 < 5);

    }
}
