public class Cliente {
    String nome, CPF, RG, nomeMae, nomePai, clienteEndereco, clienteCEP;
    double altura;
    char estadoCivil;
    int idade;

    void realizaTransacao (String tipoTransacaoRealizada){
        System.out.println(nome + " fez uma transação!");
        System.out.println(nome + " fez compra no " + tipoTransacaoRealizada);
    }
}
