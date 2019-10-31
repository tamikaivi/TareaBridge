package ejercicio;

public class TargetaGamer extends Decorator {

    private int costoAgregado=25;

    public TargetaGamer(Computadora componente){
        super(componente);
    }

    public void operation(ComputadoraGamer gamer){
        gamer.setCosto(gamer.getCosto()+costoAgregado);
        super.operation(gamer);

        System.out.println("Targeta Gamer con el precio de: "+costoAgregado);
    }



}
