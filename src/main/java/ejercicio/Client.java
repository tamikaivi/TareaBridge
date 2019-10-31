package ejercicio;

public class Client {
    public static void main(String[] args) {
        ComputadoraGamer gamer= new ComputadoraGamer(100);
        Computadora compuGamer = gamer;
        compuGamer = new TecladoGamer(compuGamer);
        compuGamer = new TargetaGamer(compuGamer);
        compuGamer = new MouseGamer(compuGamer);
        compuGamer = new MonitorSamsung(compuGamer);

        compuGamer.operation(gamer);
    }
}
