public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor();
        Curso curso = new Curso();
        Aluno aluno = new Aluno();


        professor.setTitulacao("Doutorado");
        professor.setSalario(5000.0);

        curso.setNome("Ciência da Computação");

        aluno.setNotas(9.5);
        aluno.setCurso(curso);


        curso.addProfessor(professor);
        curso.addAluno(aluno);

        professor.imprimir();
        System.out.println();
        curso.imprimirCurso();
        System.out.println();
        aluno.imprimir();
    }
}
