public class Endereco {


    private String rua;
    private String cidade;
    private String estado;


    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }


    public static void main(String[] args) {

        Endereco endereco = new Endereco();


        endereco.setRua("Rua ABC, 123");
        endereco.setCidade("Brasilia");
        endereco.setEstado("DF");


        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("Estado: " + endereco.getEstado());
    }
}
