public class App {
    public static void main(String[] args) throws Exception {

        Professor p1 = new Professor("Jesiel");
        Aluno a1 = new Aluno("Yuck", "ABCDE");
        Aluno a2 = new Aluno("Eric", "EFGHI");
        
        Curso c1 = new Curso("ADS", "SUPERIOR", 2000, p1);
        
        c1.realizarMatricula(a1);
        c1.realizarMatricula(a2);
        
        c1.statusCurso();

        Certificado cert = new Certificado(a1,c1, 2022, 2025);

        cert.exibirCertificado();



    }

}
