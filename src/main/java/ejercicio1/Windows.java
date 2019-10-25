package ejercicio1;

public class Windows implements IPlataforma {

    @Override
    public void crearPlataforma() {
        System.out.print("Creando Plataforma Windows");
    }
    @Override
    public void arquitectura86() {
        System.out.println(" con Arquitectura de x86");
    }

    @Override
    public void arquitectura64() {
        System.out.println(" con Arquitectura de x64");
    }
}
