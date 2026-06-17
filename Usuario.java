package psoft-atvd5;
import java.util.*;

public class Usuario {

    private String nome;
    private String email;
    private Ordenador<Integer> ordenador;


    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.ordenador = new BubbleSort();
    }

    public List<Integer> ordena(List<Integer> elementos) {
       return ordenador.ordenar(elementos);
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", email=" + email + ", ordenador=" + ordenador.toString() + "]";
    }

    
}