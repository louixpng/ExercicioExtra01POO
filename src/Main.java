import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        Transações t = new Transações();
        t.dataHora = LocalDateTime.now();

        Agências a = new Agências();
        Agências a1 = new Agências();
        Agências a2 = new Agências();
        Agências a3 = new Agências();

        ContaClientes cc = new ContaClientes();
        ContaClientes cc1 = new ContaClientes();
        ContaClientes cc2 = new ContaClientes();
        ContaClientes cc3 = new ContaClientes();

        Banco b = new Banco();
        Banco b1 = new Banco();
        Banco b2 = new Banco();
        Banco b3 = new Banco();

        c.nome = "Iale";
        c.altura = 1.64;
        c.estadoCivil = 'c';
        c.idade = 20;
        a.numAgencia = 1;
        a.enderecoAgencia = "Rua do Lazer, Boa Vista. Recife - PE";
        b.bancoEndereco = "Rua da Concórdia 234, Santo Antônio. Recife - PE";
        cc.concaCli_Id = 13551212;
        c.realizaTransacao("Pix");

        c1.nome = "Luís";
        c1.altura = 1.77;
        c1.estadoCivil = 's';
        c1.idade = 19;
        a1.numAgencia = 3;
        a1.enderecoAgencia = "Rua do Lazer, Boa Vista. Recife - PE";
        b1.bancoEndereco = "Rua da Concórdia 234, Santo Antônio. Recife - PE";
        cc1.concaCli_Id = 13551212;
        c1.realizaTransacao("Débito");

        c2.nome = "Rafael";
        c2.altura = 1.79;
        c2.estadoCivil = 'c';
        c2.idade = 18;
        a2.numAgencia = 2;
        a2.enderecoAgencia = "Rua do Lazer, Boa Vista. Recife - PE";
        b2.bancoEndereco = "Rua da Concórdia 234, Santo Antônio. Recife - PE";
        cc2.concaCli_Id = 13551212;
        c2.realizaTransacao("Crédito");

        c3.nome = "Carol";
        c3.altura = 1.69;
        c3.estadoCivil = 'c';
        c3.idade = 18;
        a3.numAgencia = 4;
        a3.enderecoAgencia = "Rua do Lazer, Boa Vista. Recife - PE";
        b3.bancoEndereco = "Rua da Concórdia 234, Santo Antônio. Recife - PE";
        cc3.concaCli_Id = 13551212;
        c3.realizaTransacao("Cheque sem fundo");

        System.out.println(c.nome + " " + c.altura + " " + c.estadoCivil + " " + c.idade + " com conta de ID " + cc.concaCli_Id + " fez uma transação na data e horários: " +  t.dataHora + " Agência: " + a.numAgencia + " " + a.enderecoAgencia + " no banco com sede em: " + b.bancoEndereco);
        System.out.println(c1.nome + " " + c1.altura + " " + c1.estadoCivil + " " + c1.idade + " com conta de ID " + cc1.concaCli_Id + " fez uma transação na data e horários: " +  t.dataHora + " Agência: " + a1.numAgencia + " " + a1.enderecoAgencia + " no banco com sede em: " + b1.bancoEndereco);
        System.out.println(c2.nome + " " + c2.altura + " " + c2.estadoCivil + " " + c2.idade + " com conta de ID " + cc2.concaCli_Id + " fez uma transação na data e horários: " +  t.dataHora + " Agência: " + a2.numAgencia + " " + a2.enderecoAgencia + " no banco com sede em: " + b2.bancoEndereco);
        System.out.println(c3.nome + " " + c3.altura + " " + c3.estadoCivil + " " + c3.idade + " com conta de ID " + cc3.concaCli_Id + " fez uma transação na data e horários: " +  t.dataHora + " Agência: " + a3.numAgencia + " " + a3.enderecoAgencia + " no banco com sede em: " + b3.bancoEndereco);
    }
}
