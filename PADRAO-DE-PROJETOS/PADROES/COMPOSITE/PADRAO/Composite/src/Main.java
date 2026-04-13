//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Morador morador1 = new Morador("João");
        Morador morador2 = new Morador("Maria");
        Morador morador3 = new Morador("Carlos");
        Morador morador4 = new Morador("Jackson");
        Morador morador5 = new Morador("Ana");



        Apartamento ap01 = new Apartamento("101");
        Apartamento ap02 = new Apartamento("102");
        Apartamento ap03 = new Apartamento("202");
        ap01.adicionarMorador(morador1);
        ap01.adicionarMorador(morador2);
        ap02.adicionarMorador(morador3);
        ap03.adicionarMorador(morador4);
        ap03.adicionarMorador(morador5);

        Andar andar1 = new Andar("Andar 1");
        Andar andar2 = new Andar("Andar 2");
        andar2.adicionarApartamento(ap03);

        Edificio edificio = new Edificio("Florida");
        andar1.adicionarApartamento(ap01);
        andar1.adicionarApartamento(ap02);
        edificio.adicionarAndar(andar1);
        edificio.adicionarAndar(andar2);
        edificio.exibirInformacao();
    }
}