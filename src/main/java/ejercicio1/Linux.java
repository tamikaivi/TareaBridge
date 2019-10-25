package ejercicio1;

public class Linux implements IPlataforma  {

    @Override
    public void crearPlataforma() {
        System.out.print("Creando Plataforma Linux");
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
