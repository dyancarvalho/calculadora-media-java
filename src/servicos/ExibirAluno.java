package servicos;

import modelo.Aluno;

public class ExibirAluno {

    public static void exibirDadosDoAluno(Aluno aluno){

        System.out.println(
                "Matrícula: " + aluno.getMatricula()
                + ";\nAluno: " + aluno.getNome()
                + ";\nMédia = " +  String.format("%.1f", aluno.getMedia())
                + ";\nStatus = " + aluno.getSituacaoAluno());
    }
}
