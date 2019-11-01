package ejercicio;

public class Arquitecto {
    private int precio;
    private String date;

    public Arquitecto(int precio, String date){
        this.precio =precio;
        this.date=date;

    }

    public void arquitectosDisponibles()    {

        System.out.println("Buscando Arquitecto Disponibles para el prestamo de: "+this.precio+" y para el mes de: "+this.date);
        if (precio>=1 && precio<=2000){
            System.out.println("El Arquitecto disponible es Sergio");
        }else if (precio>=2001 && precio<=20000){
            System.out.println("El Arquitecto disponible es Kevin");
        }else {
            System.out.println("No hay arquitectos disponibles para ese monto");
        }
    }
}
