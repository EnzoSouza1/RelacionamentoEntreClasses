import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private final List<Aluno> alunos;
    private final List<Curso> cursos;
    private Professor professor;


    public Disciplina() {
        this.alunos = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }


    public List<Aluno> getAlunos() {
        return new ArrayList<>(alunos);
    }


    public void addCurso(Curso curso) {
        cursos.add(curso);
    }


    public List<Curso> getCursos() {
        return new ArrayList<>(cursos);
    }


    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


    public Professor getProfessor() {
        return professor;
    }


    public void imprimirDisciplina() {
        System.out.println("Informações da Disciplina:");
        System.out.println("Nome: " + nome);

        if (professor != null) {
            System.out.println("Professor: " + professor.getTitulacao() + " " + professor.getSalario());
        } else {
            System.out.println("A disciplina não tem professor associado.");
        }

        if (!alunos.isEmpty()) {
            System.out.println("Alunos na disciplina:");
            for (Aluno aluno : alunos) {
                System.out.println("- Aluno: " + aluno.getNotas());
            }
        } else {
            System.out.println("A disciplina não tem alunos associados.");
        }

        if (!cursos.isEmpty()) {
            System.out.println("Cursos associados à disciplina:");
            for (Curso curso : cursos) {
                System.out.println("- Curso: " + curso.getNome());


                List<Professor> professoresCurso = curso.getProfessores();
                if (!professoresCurso.isEmpty()) {
                    System.out.println("  Professores associados ao curso:");
                    for (Professor professorCurso : professoresCurso) {
                        System.out.println("  - " + professorCurso.getTitulacao() + " " + professorCurso.getSalario());
                    }
                } else {
                    System.out.println("  O curso não tem professores associados.");
                }
            }
        } else {
            System.out.println("A disciplina não tem cursos associados.");
        }
    }
}
