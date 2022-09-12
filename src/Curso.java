import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private String nivel;
    private int ch;
    private Professor professor;
    private List<Aluno> alunos; 

public Curso (String nome, String nivel, int ch, Professor professor){

    this.nome = nome;
    this.nivel = nivel;
    this.ch = ch;
    this.professor = professor;
    this.alunos = new ArrayList<>();

}
public void realizarMatricula(Aluno aluno){

    this.alunos.add(aluno);

}

public int qntdAlunos(){

    return alunos.size();

}

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getNivel() {
    return nivel;
}
public void setNivel(String nivel) {
    this.nivel = nivel;
}
public int getCh() {
    return ch;
}
public void setCh(int ch) {
    this.ch = ch;
}
public String getNomeProfessor() {
    return this.professor.getNome();
}

public void statusCurso(){

    System.out.println("\tSTATUS DO CURSO");
    System.out.println("CURSO: " + this.getNome());
    System.out.println("NIVEL: " + this.getNivel());
    System.out.println("CARGA HORARIA: " + this.getCh());
    System.out.println("PROFESSOR: " + professor.getNome());
    System.out.println("QUANTIDADE DE ALUNOS: " + qntdAlunos());

}

}
