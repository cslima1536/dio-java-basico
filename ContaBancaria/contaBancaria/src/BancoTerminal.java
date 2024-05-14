public class  BancoTerminal{
    public static void main(String[] args) {
        // Variáveis iniciais
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        // Verifica se o saldo é maior que o valor solicitado
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado; // Atualiza o saldo
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Imprime o valor do saldo
        System.out.println("Saldo atual: R$" + saldo);

        // Nova execução com outros valores
        saldo = 15.0;
        valorSolicitado = 22.0;

        // Verifica novamente
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado; // Atualiza o saldo
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Imprime o novo valor do saldo
        System.out.println("Novo saldo: R$" + saldo);
    }
}