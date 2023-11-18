import java.util.ArrayList;
import java.util.List;

public class Professor {

    private String titulacao;
    private double salario;
    private final List<Curso> cursos;


    public Professor() {
        this.cursos = new ArrayList<>();
    }


    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }


    public void addCurso(Curso curso) {
        cursos.add(curso);
    }


    public List<Curso> getCursos() {
        return new ArrayList<>(cursos);
    }


    public void imprimir() {
        System.out.println("Informações do Professor:");
        System.out.println("Titulação: " + titulacao);
        System.out.println("Salário: " + salario);
        
        if (!cursos.isEmpty()) {
            System.out.println("Cursos associados:");
            for (Curso curso : cursos) {
                System.out.println("- " + curso.getNome());
            }
        } else {
            System.out.println("O professor não está associado a nenhum curso.");
        }
    }
}
