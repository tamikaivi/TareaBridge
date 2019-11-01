package ejercicio;

public class Banco {
    private int precio;

    public Banco(int precio) {
        this.precio = precio;
    }
    public void findBanco(){
        System.out.println("Buscando Bancos Disponibles para el prestamo de: "+this.precio);
        if (precio>=1 && precio<=2000){
            System.out.println("El Banco disponible es Banco Sol");
        }else if (precio>=2001 && precio<=20000){
            System.out.println("El Banco disponible es Banco Visa");
        }else {
            System.out.println("El monto que se quiere prestar no es valido");
        }
    }
}
