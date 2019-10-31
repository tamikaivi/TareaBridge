package ejercicio;

public class TecladoGamer extends Decorator {
    private int costoAgregado=10;
    public TecladoGamer(Computadora componente){
        super(componente);
    }

    public void operation(ComputadoraGamer gamer){
        gamer.setCosto(gamer.getCosto()+costoAgregado);
        super.operation(gamer);
        System.out.println("Teclado Gamer con el precio de: "+costoAgregado);
    }
}
