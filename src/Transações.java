import java.time.LocalDateTime;

public class Transações {
    char tipoTransacao;
    double valorTransacao;
    int contaOrigem, contaDestino, numTransacao;

    LocalDateTime dataHora;

    Transações (char tipoTransacao, double valorTransacao, int contaOrigem, int contaDestino, int numTransacao){
        this.tipoTransacao = tipoTransacao;
        this.valorTransacao = valorTransacao;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.numTransacao = numTransacao;
        this.dataHora = LocalDateTime.now();
    }

    void alterarTipoTransacao(char novoTipoTransacao) {
        tipoTransacao = novoTipoTransacao;
    }

    void alterarValorTransacao(double novoValorTransacao) {
        valorTransacao = novoValorTransacao;
    }

    void mostrarDetalheTransações() {
        System.out.println("Tipo de Transação: " + tipoTransacao);
        System.out.println("Valor da Transação: " + valorTransacao);
        System.out.println("Conta origem da Transação: " + contaOrigem);
        System.out.println("Conta destino da Transação: " + contaDestino);
        System.out.println("Número da Transação: " + numTransacao);
        System.out.println("Horário da Transação: " + this.dataHora);
    }

}
