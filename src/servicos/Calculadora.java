package servicos;

import alunos.enums.SituacaoAluno;
import modelo.Aluno;

public class Calculadora {

    private static double mediaMinimaParaAprovacao = 7.0;
    private static double pesoAv1 = 30.0;
    private static double pesoAv2 = 30.0;
    private static double pesoAv3 = 40.0;

    public static Double calculaMedia(Aluno aluno){

        Double notaPonderadaAv1 = (aluno.getNota1() / 100.0) * pesoAv1;
        Double notaPonderadaAv2 = (aluno.getNota2() / 100.0) * pesoAv2;
        Double notaPonderadaAv3 = (aluno.getNota3() / 100.0) * pesoAv3;

        Double media = notaPonderadaAv1 + notaPonderadaAv2 + notaPonderadaAv3;

        return media;
    };

    public static Boolean verificaAprovacao(Aluno aluno){

        Double media = aluno.setMedia(calculaMedia(aluno));

        if (media >= mediaMinimaParaAprovacao) {
            aluno.setSituacaoAluno(SituacaoAluno.APROVADO);
            return true;
        } else {
            aluno.setSituacaoAluno(SituacaoAluno.REPROVADO);
            return false;
        }
    };
}
