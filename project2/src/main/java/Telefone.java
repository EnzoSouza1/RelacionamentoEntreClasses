public class Telefone {


    private String tipo;
    private String ddd;
    private String numero;


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }


    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getDdd() {
        return ddd;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }


    public static void main(String[] args) {

        Telefone meuTelefone = new Telefone();


        meuTelefone.setTipo("Celular");
        meuTelefone.setDdd("61");
        meuTelefone.setNumero("987654321");


        System.out.println("Tipo: " + meuTelefone.getTipo());
        System.out.println("DDD: " + meuTelefone.getDdd());
        System.out.println("Número: " + meuTelefone.getNumero());
    }
}
