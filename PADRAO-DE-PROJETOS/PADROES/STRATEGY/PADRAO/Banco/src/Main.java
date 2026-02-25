import model.Aposentado;
import model.Empresa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aposentado j = new Aposentado();
        j.setNome("Joao");
        j.setSaldo(100.00);
        System.out.println(j.toString());
        j.emprestar(500.00);

        System.out.println(j.toString());
        System.out.println("============================================");

        Empresa e = new Empresa();
        e.setNome("Empresa da Vovó");
        e.setSaldo(2350.00);
        System.out.println(e.toString());
        System.out.println("============================================");

        e.emprestar(900.00);
        System.out.println(e.toString());
        System.out.println("============================================");

        e.emprestar(900000.00);
        System.out.println(e.toString());
        System.out.println("============================================");

        e.emprestar(90000.00);
        System.out.println(e.toString());


    }

}