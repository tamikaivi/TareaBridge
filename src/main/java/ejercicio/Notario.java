package ejercicio;

public class Notario {
    private int precio;
    private String date;


    public Notario(int precio, String date){
        this.precio =precio;
        this.date=date;

    }

    public void notariosDisponibles()    {
        System.out.println("Buscando Notario Disponibles para el prestamo de: "+this.precio+ " y para el mes de: "+this.date);
        if (precio>=1 && precio<=2000){
            System.out.println("El Notario disponible es Brayan");
        }else if (precio>=2001 && precio<=20000){
            System.out.println("El Notario  disponible es Fabian");
        }else {
            System.out.println("No hay Notarios disponibles para ese monto");
        }
    }
}
