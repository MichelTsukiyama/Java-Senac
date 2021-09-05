public class SenacAlgo1_1 {

    static int[] vetor = {-2, -1, 1, 2, 3, 4, 5, 7, 8, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 22};
    static int[] tabela = new int[5];
    public static void main(String[] args){

        //inicializar a tabela

        int k = 4;
        for (int i = 0; i < tabela.length; i++){
            tabela[i] = k;
            k = k + 4;
        }
            System.out.println("Indice: "+ busca(22));
    }

    static int buscaIndex (int elemento){

        for (int chave = 0; chave < tabela.length; chave++){
            if (tabela[chave] >= elemento){
                return tabela[chave];
            }
        }
        return -1;
    }

    static int busca(int elemento) {
        int posicaoMax = buscaIndex(elemento);

        for (int i = posicaoMax - 4; i <= posicaoMax; i++) {
            if (elemento == vetor[i]) {
                return i;
            }
        }
        return -1;
    }


    
}
