import java.util.ArrayList;
import java.util.List;

public class Apartamento {

    private String numero;
    private List<Morador> moradores = new ArrayList<>();

    public Apartamento(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void adicionarMorador(Morador morador) {
        moradores.add(morador);
    }

    public void removerMorador(Morador morador) {
        moradores.remove(morador);
    }
}