package ejercicio;

public class ComputadoraGamer implements Computadora {
    public int costo;

    public ComputadoraGamer(int costo) {
        this.costo = costo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void operation(ComputadoraGamer gamer){
        System.out.println("Computadora Gamer con el costo de: "+costo);
    }
}
