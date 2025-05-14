import java.util.Scanner;
import java.util.ArrayList;

public class Media {
    static public void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos");
        int qtdAlunos = scanner.nextInt();

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> nota1 = new ArrayList<>();
        ArrayList<Double> nota2 = new ArrayList<>();


        for(int i = 0; i < qtdAlunos; i++){
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            scanner.nextLine();
            String nome = scanner.nextLine();
            nomes.add(nome);


            System.out.println("Nota 1:");
            double nota = scanner.nextDouble();
            nota1.add(nota);
          
            System.out.println("Nota 2:");
            nota = scanner.nextDouble();
            nota2.add(nota);
        }


        for(int i = 0; i < nomes.size(); i++){
            System.out.println("Nome do aluno: " + nomes.get(i));
            System.out.println("Nota 1: " + nota1.get(i));
            System.out.println("nota 2: " + nota2.get(i));


            double media = (nota1.get(i) + nota2.get(i)) / 2;
            System.out.printf("Média: %.2f", media);
            
            System.out.println("\n");
        }
        Double somaNota1 = .0;
        Double somaNota2 = .0;

        for(int i = 0; i < nomes.size(); i++){
            somaNota1 += nota1.get(i);
            somaNota2 += nota2.get(i);
        }

        Double mediaNota1 = somaNota1/qtdAlunos;
        Double mediaNota2 = somaNota2/qtdAlunos;

        System.out.printf("Média das Notas 1: %.2f\n", mediaNota1);
        System.out.printf("Média das Notas 2: %.2f\n", mediaNota2);

        Double mediaGeral = (mediaNota1 + mediaNota2)/2;

        System.out.printf("Média geral: %.2f\n", mediaGeral);

        scanner.close();
  
    }   
}