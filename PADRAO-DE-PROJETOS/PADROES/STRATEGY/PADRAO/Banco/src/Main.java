import model.Cliente;
import model.ComEmprestimo;
import model.TipoCliente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setNome("Joao");
        c.setSaldo(100.00);
        c.setTipo(TipoCliente.CLIENTE_COMUM);
        c.setEmprestimo(new ComEmprestimo());
        c.emprestar();

        System.out.println(c.toString());


    }

}