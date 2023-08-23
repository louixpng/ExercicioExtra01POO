public class ContaClientes {
    String contaCli_Deb;
    int contaCli_Id, contaCli_Tipo;

    double contaCli_Saldo;

    ContaClientes (String contaCli_Deb, int contaCli_Id, int contaCli_Tipo, double contaCli_Saldo){
        this.contaCli_Deb = contaCli_Deb;
        this.contaCli_Id = contaCli_Id;
        this.contaCli_Tipo = contaCli_Tipo;
        this.contaCli_Saldo = contaCli_Saldo;
    }

    void alterarSaldo (double novoSaldo) {
        contaCli_Saldo = novoSaldo;
    }

    void mostrarDetalheContaClientes() {
        System.out.println("Cartão de Débito: " + contaCli_Deb);
        System.out.println("Id da conta: " + contaCli_Id);
        System.out.println("Tipo da conta: " + contaCli_Tipo);
        System.out.println("Saldo da conta: " + contaCli_Saldo);
    }
}
