import java.util.ArrayList;
import java.util.List;

public class Andar {
    private String numero;
    private List<Apartamento> apartamentos = new ArrayList<>();

    public Andar(String numero) {
        this.numero = numero;
    }

    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public String getNumero() {
        return numero;
    }

    public void adicionarApartamento(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }

}
