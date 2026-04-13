import entity.AdministradoresEmpresa;
import entity.EquipeSuporte;
import entity.Observer;
import entity.Sistema;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema("CAMERAS DE SEGURANÇA");
        Observer equipeSuporte = new EquipeSuporte();
        sistema.adicionar(equipeSuporte);
      
        System.out.println("-----------------------------------");
        Observer administradorEmpresa = new AdministradoresEmpresa();
        sistema.adicionar(administradorEmpresa);
        sistema.notificar();
    }

}