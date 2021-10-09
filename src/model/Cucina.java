package model;

/**
 * @author Oniichan
 * @data 09/10/2021
 * @project Progetto_ristorante
 */
public class Cucina implements Runnable{
    private String nome;
    private String piatto;

    public Cucina(String nome){
        this.nome = nome;
    }
    @Override
    public void run() {

    }
}
