public class Aluno {

    private double notasQ;
    private Curso curso;


    public Aluno() {

        this.notasQ = 0.0;
    }


    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }


    public void setNotas(double notasQ) {
        this.notasQ = notasQ;
    }

    public double getNotas() {
        return notasQ;
    }


    public void imprimir() {
        System.out.println("Informações do Aluno:");
        System.out.println("Notas: " + notasQ);
        
        if (curso != null) {
            System.out.println("Curso: " + curso.getNome());
        } else {
            System.out.println("O aluno não está associado a nenhum curso.");
        }
    }
}
