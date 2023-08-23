public class Agências {
    String enderecoAgencia;
    int numAgencia;

    Agências (String enderecoAgencia, int numAgencia){
        this.enderecoAgencia = enderecoAgencia;
        this.numAgencia = numAgencia;
    }

    void alterarAgênciasNumero(int newAgenciaNumero){
        numAgencia = newAgenciaNumero;
    }
    void mostrarDetalheAgências() {
        System.out.println("Endereço da Agência: " + enderecoAgencia);
        System.out.println("Número da Agência: " + numAgencia);
    }
}
