package ejercicio;

public class Decorator implements Computadora {
    private Computadora componente;

    public Decorator(Computadora componente){
        this.componente = componente;

    }

    public void operation(ComputadoraGamer gamer){
        componente.operation(gamer);
    }
}
