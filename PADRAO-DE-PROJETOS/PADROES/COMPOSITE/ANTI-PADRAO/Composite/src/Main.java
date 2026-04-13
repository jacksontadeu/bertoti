//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Morador m1= new Morador("João");
        Morador m2= new Morador("Maria");
        Morador m3= new Morador("Pedro");
        Morador m4= new Morador("Jackson");

        Apartamento ap1 = new Apartamento("101");
        ap1.adicionarMorador(m1);
        ap1.adicionarMorador(m4);
        Apartamento ap2 = new Apartamento("201");
        ap2.adicionarMorador(m2);
        Apartamento ap3 = new Apartamento("301");
        ap3.adicionarMorador(m3);

        Andar andar1 = new Andar("1º andar");
        andar1.adicionarApartamento(ap1);
        Andar andar2 = new Andar("2º andar");
        andar2.adicionarApartamento(ap2);
        Andar andar3 = new Andar("3º andar");
        andar3.adicionarApartamento(ap3);

        Edificio edificio = new Edificio("Edificio Central");
        edificio.adicionarAndar(andar1);
        edificio.adicionarAndar(andar2);
        edificio.adicionarAndar(andar3);

        edificio.exibirInformacao();

    }
}