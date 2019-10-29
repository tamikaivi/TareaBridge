package ejercicio;

public class Banco implements IBanco {

    Persona persona;

    public Banco(Persona persona) {
        this.persona = persona;
    }

    @Override
    public void depositar() {
        System.out.println("Su deposito ha sido exitoco con el monto de: "+persona.getMonto());
    }

    @Override
    public void retirar() {
        System.out.println("Su retiro ha sido exitoco con el monto de: "+persona.getMonto());
    }
}
