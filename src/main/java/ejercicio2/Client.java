package ejercicio2;

public class Client {
    public static void main(String[] args) {

        Arquitecturax64 arquitecturax64 = new Arquitecturax64();
        Windows windows = new Windows(arquitecturax64);
        windows.crearPlataforma();

        Arquitecturax86 arquitecturax86 = new Arquitecturax86();
        Linux linux = new Linux(arquitecturax86);
        linux.crearPlataforma();

        Mac mac = new Mac(arquitecturax64);
        mac.crearPlataforma();

    }
}
