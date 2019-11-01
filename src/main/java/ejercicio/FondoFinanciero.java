package ejercicio;

public class FondoFinanciero {
    private int precio;


    public FondoFinanciero(int precio){
        this.precio = precio;

    }

    public void findFondoFinanciero(){
        System.out.println("Buscando Fondo Financiero Disponibles por el prestamo de: "+this.precio);
        if (precio>=1 && precio<=2000){
            System.out.println("El Fondo Financiero disponible es Fondo Financiero 1");
        }else if (precio>=2001 && precio<=20000){
            System.out.println("El Fondo Financiero disponible es Fondo Financiero 2");
        }else {
            System.out.println("El monto que se quiere prestar no es valido");
        }
    }
}
