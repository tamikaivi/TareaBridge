package ejercicio;

public class MonitorSamsung extends Decorator {
    private int costoAgregado=50;

    public MonitorSamsung(Computadora componente){
        super(componente);
    }

    public void operation(ComputadoraGamer gamer){
        gamer.setCosto(gamer.getCosto()+costoAgregado);
        super.operation(gamer);
        System.out.println("Monitor Samsumg con el precio de : "+costoAgregado);
    }


}
