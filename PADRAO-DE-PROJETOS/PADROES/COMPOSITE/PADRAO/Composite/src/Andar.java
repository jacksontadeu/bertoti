import java.util.ArrayList;
import java.util.List;

public class Andar implements EdificioComposite {

    private String nome;
    private List<EdificioComposite> apartamentos = new   ArrayList<>();

    public Andar(String nome) {
        this.nome = nome;

    }
    public void adicionarApartamento(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }
    public void removerApartamento(Apartamento apartamento) {
        apartamentos.remove(apartamento);
    }

    @Override
    public void exibirInformacao() {
        System.out.println("Andar: " + nome);

        for (var apartamento : apartamentos) {
            apartamento.exibirInformacao();
            System.out.println("-------------------");
        }
    }
}
