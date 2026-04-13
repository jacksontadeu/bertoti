public class Morador implements EdificioComposite {

    private String nome;


    public Morador(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirInformacao() {
        System.out.println("Morador: " + nome);
    }
}
