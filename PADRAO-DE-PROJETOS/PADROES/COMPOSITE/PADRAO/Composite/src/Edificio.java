import java.util.ArrayList;
import java.util.List;

public class Edificio implements EdificioComposite {

    private String nome;
   private List<EdificioComposite> andares = new ArrayList<>();

    public Edificio(String nome) {
        this.nome = nome;

    }
    public void adicionarAndar(EdificioComposite andar) {
        andares.add(andar);
    }
    public void removerAndar(EdificioComposite andar) {
        andares.remove(andar);
    }

    @Override
    public void exibirInformacao() {
        System.out.println("Edificio: " + nome);
        for(EdificioComposite andar : andares) {
            andar.exibirInformacao();

        }
    }
}
