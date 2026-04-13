package entity;

public class AdministradoresEmpresa implements Observer{
    @Override
    public void update(Sistema distema, String message) {
        System.out.println("Administrador da Empresa recebeu a notificação: " + message);
    }
}
