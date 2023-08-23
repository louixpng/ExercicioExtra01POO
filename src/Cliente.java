public class Cliente {
    String nome;
    double altura;
    char estadoCivil;
    int idade;

    Cliente (String nome, double altura, char estadoCivil, int idade){
        this.nome = nome;
        this.altura = altura;
        this.estadoCivil = estadoCivil;
        this.idade = idade;
    }
    void realizaTransacao (String tipoTransacaoRealizada){
        System.out.println(nome + " fez uma transação!");
        System.out.println(nome + " fez compra no " + tipoTransacaoRealizada);
    }

    void alterarIdade (int novaIdade){
        idade = novaIdade;
    }

    void mostrarDetalheClientes() {
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("Idade: " + idade);
    }
}
