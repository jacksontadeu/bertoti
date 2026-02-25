package model;

public class Aposentado extends Cliente implements Emprestimo{
    @Override
    public void emprestar(Double valor) {
        Double montante = this.getSaldo() + valor;
        this.setSaldo(montante);

    }
}
