package entity;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Observer> observers = new ArrayList<>();
    private String nomeSistema;

    public String getNomeSistema() {
        return nomeSistema;
    }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }

    public Sistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }
    public void adicionar(Observer observer) {
        observers.add(observer);
    }
    public void remover(Observer observer) {
        observers.remove(observer);
    }
    public void notificar(){
        for (Observer observer : observers) {
            observer.update(this, "O sistema " + nomeSistema + " foi atualizado!");
        }
    }
}
