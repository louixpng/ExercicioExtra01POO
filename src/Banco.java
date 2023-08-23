public class Banco {
    String bancoEndereco;
    int bancoAgencia;

    Banco (String bancoEndereco, int bancoAgencia){
        this.bancoEndereco = bancoEndereco;
        this.bancoAgencia = bancoAgencia;
    }

    void alterarBancoAgencia(int newBancoAgencia){
       bancoAgencia = newBancoAgencia;
    }
    void mostrarDetalheBanco() {
        System.out.println("Endereço do Banco: " + bancoEndereco);
        System.out.println("Agência do Banco: " + bancoAgencia);
    }
}
