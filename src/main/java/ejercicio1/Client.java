package ejercicio1;

public class Client {
    public static void main(String[] args) {
        Windows windows = new Windows();
        windows.crearPlataforma();
        windows.arquitectura64();

        Linux linux = new Linux();
        linux.crearPlataforma();
        linux.arquitectura86();

        Mac mac = new Mac();
        mac.crearPlataforma();
        mac.arquitectura64();
    }
}
