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
    }

}
