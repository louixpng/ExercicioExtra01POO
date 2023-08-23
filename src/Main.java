import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();

        Cliente c = new Cliente("Iale", 1.64, 'c', 20);
        Agências a = new Agências("Rua da Hora", 0001);
        Banco b = new Banco("Rua da Moeda", 0001);
        Transações t = new Transações('a', 3280.99, 21309321, 31233123, 10000);
        ContaClientes cc = new ContaClientes("9345 2232 1312 2131", 21309321, 1, 3200.0);

        c.mostrarDetalheClientes();
        c.realizaTransacao("Pix");
        a.mostrarDetalheAgências();
        b.mostrarDetalheBanco();
        t.mostrarDetalheTransações();
        cc.mostrarDetalheContaClientes();

        c.alterarIdade(21);
        a.alterarAgênciasNumero(0002);
        b.alterarBancoAgencia(0002);
        cc.alterarSaldo(1560.0);
        t.alterarTipoTransacao('b');
        t.alterarValorTransacao(9765.0);

        System.out.println(" ");

        c.mostrarDetalheClientes();
        c.realizaTransacao("Débito");
        a.mostrarDetalheAgências();
        b.mostrarDetalheBanco();
        t.mostrarDetalheTransações();
        cc.mostrarDetalheContaClientes();
    }
}
