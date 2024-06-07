// Classe para representar os funcionários do petshop
class Funcionario extends SerVivo {
    private String cargo;

    public Funcionario(String nome, String cargo) {
        super(nome);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
