// Classe para representar os animais do petshop
class Animal extends SerVivo {
    private String especie;

    public Animal(String nome, String especie) {
        super(nome);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }
}