public class Cliente {
    String nome, cpf, rg, nomeMae, nomePai, clienteEndereco, clienteCEP;
    double altura;
    char estadoCivil;
    int idade;

    Cliente (String nome, String cpf, String rg, String nomeMae, String nomePai, String clienteEndereco, String clienteCEP, double altura, char estadoCivil, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.clienteEndereco = clienteEndereco;
        this.clienteCEP = clienteCEP;
        this.altura = altura;
        this.estadoCivil = estadoCivil;
        this.idade = idade;
    }
    void realizaTransacao (String tipoTransacaoRealizada){
        System.out.println(nome + " fez uma transação!");
        System.out.println(nome + " fez compra no " + tipoTransacaoRealizada);
    }
}
