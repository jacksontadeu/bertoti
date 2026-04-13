package entity;

public class EquipeSuporte implements Observer {

    @Override
    public void update(Sistema sistema, String message) {
        System.out.println("Equipe de Suporte recebeu a notificação: " + message);
    }
}
