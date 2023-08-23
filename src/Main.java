import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Cliente c = new Cliente("Iale", 1.64, 'c', 20);
        Agências a = new Agências("Rua da Hora", 0001);
        Banco b = new Banco("Rua da Moeda", 0001);
        Transações t = new Transações('a', 3280.99, 21309321, 31233123, 10000);
        ContaClientes cc = new ContaClientes("9345 2232 1312 2131", 21309321, 1, 3200.0);

        c.realizaTransacao("Pix");
        System.out.println("Nome: " + c.nome);
        System.out.println("Altura: " + c.altura);
        System.out.println("Estado Civil: " + c.estadoCivil);
        System.out.println("Idade: " + c.idade);
        System.out.println("Endereço da Agência: " + a.enderecoAgencia);
        System.out.println("Número da Agência: " + a.numAgencia);
        System.out.println("Endereço do Banco: " + b.bancoEndereco);
        System.out.println("Agência do Banco: " + b.bancoAgencia);
        System.out.println("Tipo de Transação: " + t.tipoTransacao);
        System.out.println("Valor da Transação: " + t.valorTransacao);
        System.out.println("Conta origem da Transação: " + t.contaOrigem);
        System.out.println("Conta destino da Transação: " + t.contaDestino);
        System.out.println("Número da Transação: " + t.numTransacao);
        System.out.println("Cartão de Débito: " + cc.contaCli_Deb);
        System.out.println("Id da conta: " + cc.contaCli_Id);
        System.out.println("Tipo da conta: " + cc.contaCli_Tipo);
        System.out.println("Saldo da conta: " + cc.contaCli_Saldo);
    }
}
