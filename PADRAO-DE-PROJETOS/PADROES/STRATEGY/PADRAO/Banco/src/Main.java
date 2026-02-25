import model.Aposentado;

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


    }

}