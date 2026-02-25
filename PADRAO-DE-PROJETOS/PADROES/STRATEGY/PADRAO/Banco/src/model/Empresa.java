package model;

public class Empresa  extends Cliente implements Emprestimo{
    @Override
    public void emprestar(Double valor) {
        if(valor >= 100000.00 || valor < 1000){
            System.out.println("Valor fora dos limites disponiveis!!!");
        }else{
            this.setSaldo(this.getSaldo() + valor);

        }


    }
}
