package psoft-atvd5;

public class Insertion implements Ordenador {

    
    @Override
    public List<Integer> ordena(List<Integer> elementos) {
        elementos.sort(null);
        return elementos;
    }

    @Override
    public String toString() {
        return "Insertion";
    }
}