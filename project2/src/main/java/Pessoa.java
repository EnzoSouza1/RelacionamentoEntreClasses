public class Pessoa {


    private String nome;
    private String cpf;
    private String email;

    private Endereco endereco;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    public void addTelefone(Telefone telefone) {
    }


    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public Endereco getEndereco() {
        return endereco;
    }


    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();


        pessoa.setNome("João Silva");
        pessoa.setCpf("123.456.789-00");
        pessoa.setEmail("joao.silva@gmail.com");


        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("61");
        telefone.setNumero("987654321");

        pessoa.addTelefone(telefone);


        Endereco endereco = new Endereco();
        endereco.setRua("Rua ABC, 123");
        endereco.setCidade("Brasilia");
        endereco.setEstado("DF");

        pessoa.setEndereco(endereco);


        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Email: " + pessoa.getEmail());


        Telefone telefoneDaPessoa = pessoa.getTelefone();
        System.out.println("Telefone Tipo: " + telefoneDaPessoa.getTipo());
        System.out.println("Telefone DDD: " + telefoneDaPessoa.getDdd());
        System.out.println("Telefone Número: " + telefoneDaPessoa.getNumero());


        Endereco enderecoDaPessoa = pessoa.getEndereco();
        System.out.println("Endereço Rua: " + enderecoDaPessoa.getRua());
        System.out.println("Endereço Cidade: " + enderecoDaPessoa.getCidade());
        System.out.println("Endereço Estado: " + enderecoDaPessoa.getEstado());
    }

    private Telefone getTelefone() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
