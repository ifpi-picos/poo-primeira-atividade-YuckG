public class Certificado {

    public Aluno aluno;
    public Curso curso;
    private String inicioCurso;
    private String finalCurso;

public Certificado(Aluno aluno, Curso curso, int anoInicio, int anoFinal){

    this.aluno = aluno;
    this.curso = curso;
    this.inicioCurso = Integer.toString(anoInicio);
    this.finalCurso = Integer.toString(anoFinal);

}

public String getFinalCurso() {
    return finalCurso;
}
public String getInicioCurso() {
    return inicioCurso;
}

public void exibirCertificado(){
    System.out.println("=================================");
    System.out.println("\tCERTIFICADO\t\t");
    System.out.println("CURSO: \t" + curso.getNome());
    System.out.println("ALUNO: \t" + aluno.getNome());
    System.out.println("INICIO DO CURSO: " + getInicioCurso());
    System.out.println("FINAL DO CURSO: " + getFinalCurso());
    System.out.println("=================================");

}

}
