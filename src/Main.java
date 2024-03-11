import java.util.Scanner;
import modelo.Aluno;

import static servicos.Calculadora.verificaAprovacao;
import static servicos.ExibirAluno.exibirDadosDoAluno;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("====================== CALCULADORA DE MÉDIA - UNIFACS ======================");
        System.out.println();
        System.out.print("Digite sua matricula: ");
        aluno.setMatricula(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Digite seu nome: ");
        aluno.setNome(scanner.nextLine());
        System.out.println();

        System.out.println("Preencha as informações abaixo com as suas pontuações de 0 a 100.");
        System.out.println();
        System.out.print("Nota Avaliação 1: ");
        aluno.setNota1(scanner.nextDouble());
        System.out.print("Nota Avaliação 2: ");
        aluno.setNota2(scanner.nextDouble());
        System.out.print("Nota Avaliação 3: ");
        aluno.setNota3(scanner.nextDouble());
        System.out.println();

        System.out.println("=========== RESULTADO FINAL ===========");
        System.out.println();

        verificaAprovacao(aluno);
        exibirDadosDoAluno(aluno);
    }
}