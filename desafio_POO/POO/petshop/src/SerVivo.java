// Classe base para todos os seres vivos no petshop
abstract class SerVivo {
    private String nome;

    public SerVivo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}