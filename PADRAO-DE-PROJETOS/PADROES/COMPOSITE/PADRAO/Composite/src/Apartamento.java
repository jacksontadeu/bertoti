import java.util.ArrayList;
import java.util.List;

public class Apartamento implements EdificioComposite {

    private String numero;
    private List<EdificioComposite> moradores = new ArrayList<>();

    public Apartamento(String numero) {
        this.numero = numero;
    }
    public void adicionarMorador(Morador morador) {
        moradores.add(morador);
    }
    public void removerMorador(Morador morador) {
        moradores.remove(morador);
    }

    @Override
    public void exibirInformacao() {
        System.out.println("Apartamento: " + numero);
        for(var morador : moradores) {
            morador.exibirInformacao();

        }

    }
}
