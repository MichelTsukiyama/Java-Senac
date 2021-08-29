public class SenacAula2 {
    public static void main (String args[]) {

        int nota_p1 = 8;
        int nota_p2 = 9;
        int nota_p3 = 5;

       /*  boolean resultado_1 = (nota_p1 == nota_p2);
        boolean resultado_2 = (nota_p2 == nota_p3);

        boolean resultado = resultado_1 && resultado_2;

        System.out.println(resultado); */

       /*  float media = (nota_p1 + nota_p2 + nota_p3) / 3;

        System.out.println(media);

        if(media >= 7) {
            System.out.println("Sua média é maior ou igual a 7");
            System.out.println("Parabéns, aprovado!");
        } else if ((media >=4) && (media < 7)) {
            System.out.println("Nota menor que 7, mas pode fazer recuperação");
        } else {
            System.out.println("Média menor que 4");
            System.out.println("Reprovado");
        } */

        char dia_semana = 'S'; // S - segunda, T - terça, Q - Quarta, X - Quinta, Z - Sexta, C - Sabado, D - Domingo

        switch(dia_semana) {
            case 'S':
                System.out.println("Segunda");
            break;
            case 'T':
                System.out.println("Terça");
            break;
            case 'Q':
                System.out.println("Quarta");
            break;
            case 'X':
                System.out.println("Quinta");
            break;
            case 'Z':
                System.out.println("Sexta");
            break;
            case 'C':
                System.out.println("Sábado");
            break;
            default:
                System.out.println("Domingo");
            break;

        }

    }
}
