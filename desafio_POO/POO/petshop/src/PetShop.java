public class PetShop {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Bobby", "Cachorro");
        Funcionario funcionario1 = new Funcionario("Ana", "Veterinária");
        Servico servico1 = new Servico("Banho e Tosa", 50.0);

        System.out.println("Animal: " + animal1.getNome() + " - Espécie: " + animal1.getEspecie());
        System.out.println("Funcionário: " + funcionario1.getNome() + " - Cargo: " + funcionario1.getCargo());
        System.out.println("Serviço: " + servico1.getDescricao() + " - Preço: " + servico1.getPreco());
    }
}