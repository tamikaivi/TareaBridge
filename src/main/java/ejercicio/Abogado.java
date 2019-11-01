package ejercicio;

public class Abogado {
    private int precio;
    private String date;

    public Abogado(int precio, String date){
        this.precio=precio;
        this.date=date;
    }

    public void abogadosDisponibles()    {
        System.out.println("Buscando Abogado Disponibles para el prestamo de: "+this.precio+" y para el mes de: "+this.date);
        if (precio>=1 && precio<=2000){
            System.out.println("El Abogado disponible es Camila");
        }else if (precio>=2001 && precio<=20000){
            System.out.println("El Abogado disponible es Martin");
        }else {
            System.out.println("No hay Abogados disponibles para ese monto");
        }
    }

}
