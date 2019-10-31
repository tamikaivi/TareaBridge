package ejercicio;

public class MouseGamer extends Decorator {

    private int costoAgregado=15;
    public MouseGamer(Computadora componente){
        super(componente);
    }

    public void operation(ComputadoraGamer gamer){
        gamer.setCosto(gamer.getCosto()+costoAgregado);
        super.operation(gamer);
        System.out.println("Mouse Gamer con el precio de: "+costoAgregado);
    }

}
