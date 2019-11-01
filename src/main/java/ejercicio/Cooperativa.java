package ejercicio;

public class Cooperativa {
    private int precio;

    public Cooperativa(int precio){
        this.precio=precio;

    }

    public void findCooporativa()    {
        System.out.println("Buscando Cooperativa Disponibles pro el prestamo de: "+this.precio);
        if (precio>=1 && precio<=2000){
            System.out.println("La Cooperativa disponible es Cooperativa Canito");
        }else if (precio>=2001 && precio<=20000){
            System.out.println("La Cooperativa disponible es Cooperativa Hamster");
        }else {
            System.out.println("El monto que se quiere prestar no es valido");
        }
    }
}
