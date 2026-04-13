package model;

public class SemEmprestimo implements Emprestimo{
    @Override
    public void emprestar(){
        System.out.println("Você não tem direito a fazer emprestimo!!!");

    }
}
