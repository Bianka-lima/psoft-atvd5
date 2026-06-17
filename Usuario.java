package app;
import java.util.*;

public class Usuario {

    private String nome;
    private String email;
    private Ordenador<Integer> ordenador;


    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public List<Integer> ordena(List<Integer> elementos) {
        ordenador.ordenar(elementos);
        return elementos;
    }

    public void setBubble() {
        ordenador = new BubbleSort();
    }

    public void setInsertion() {
        ordenador = new InsertionSort();
    }

    public void setMerge() {
        ordenador = new MergeSort();
    }

    public void setQuick() {
        ordenador = new QuickSort();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}