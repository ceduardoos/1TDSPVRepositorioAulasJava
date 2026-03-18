import java.util.Scanner;

public class ExemplosEntradaSaida {

    public static void main(String[] args) {
        //Ler as notas dos alunos e calcular a media FIAP
        Scanner leitor = new Scanner(System.in);


        //Declarar as variaveis necessarias
        System.out.println("Digite o nome do aluno");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite a nota da CP1");
        double cp1 = leitor.nextDouble(); //le um valor do tipo doubledo teclado
        System.out.println("Digite a nota da CP2");
        double cp2 = leitor.nextDouble();

            cp1 += cp2;
            cp1 /= 2;
            System.out.println(" Sua média do Checkpoint é: " + cp1);

        System.out.println("Digite a nota do GS");
        double gs = leitor.nextDouble();

            gs += 0;
            System.out.println(" Sua média da GS é: " + gs);

        System.out.println("Digite a nota do Challenge1");
        double challenge1 = leitor.nextDouble();
        System.out.println("Digite a nota do Challenge2");
        double challenge2 = leitor.nextDouble();

            challenge1 += challenge2;
            challenge1 /= 2;
            System.out.println(" Sua média do Challenge é: " + challenge2);

        System.out.println("---------------------------------------------------------");
            cp1 *= 0.2;
            gs *= 0.6;
            challenge1 *= 0.2;
            cp1 += gs += challenge1;
            System.out.println( nome +  " sua média do Primeiro Semestre é: " + cp1 * 0.4);






    }


}
