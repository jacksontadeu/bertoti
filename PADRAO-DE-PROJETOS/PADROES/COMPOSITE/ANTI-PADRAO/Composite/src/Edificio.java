import java.util.ArrayList;
import java.util.List;

public class Edificio {
    private String nome;
    private List<Andar> andares = new ArrayList<>();

    public Edificio(String nome) {
        this.nome = nome;
    }

    public void adicionarAndar(Andar andar) {
        andares.add(andar);
    }

        public void exibirInformacao() {
            System.out.println("Edificio: " + nome);
            for (Andar andar : andares) {
                System.out.println("  Andar: " + andar.getNumero());
                for (Apartamento apartamento : andar.getApartamentos()) {
                    System.out.println("    Apartamento: " + apartamento.getNumero());
                    for (Morador morador : apartamento.getMoradores()) {
                        System.out.println("      Morador: " + morador.getNome());
                    }
                }
            }
        }
}