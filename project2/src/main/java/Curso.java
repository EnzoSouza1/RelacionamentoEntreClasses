import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private final List<Professor> professores;
    private final List<Aluno> alunos;


    public Curso() {
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public void addProfessor(Professor professor) {
        professores.add(professor);
    }


    public List<Professor> getProfessores() {
        return new ArrayList<>(professores);
    }


    public void imprimirCurso() {
        System.out.println("Informações do Curso:");
        System.out.println("Nome: " + nome);

        if (!professores.isEmpty()) {
            System.out.println("Professores associados:");
            for (Professor professor : professores) {
                System.out.println("- " + professor.getTitulacao() + " " + professor.getSalario());
            }
        } else {
            System.out.println("O curso não tem professores associados.");
        }


        if (!alunos.isEmpty()) {
            System.out.println("Alunos associados:");
            for (Aluno aluno : alunos) {
                System.out.println("- Aluno: " + aluno.getNotas());
            }
        } else {
            System.out.println("O curso não tem alunos associados.");
        }
    }


    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }


    public List<Aluno> getAlunos() {
        return new ArrayList<>(alunos);
    }
}
