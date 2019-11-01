package ejercicio;

public class SolicitudPrestamo {
    //Facade
    private Banco encontrarBanco;
    private Abogado econtrarAbogado;
    private FondoFinanciero encontrarFondoFinanciero;
    private Cooperativa encontrarCooperativa;
    private Arquitecto encontrarArquitecto;
    private Notario encontrarNotario;

    public SolicitudPrestamo(int precio, String date){
        encontrarBanco = new Banco(precio);
        econtrarAbogado = new Abogado(precio,date);
        encontrarFondoFinanciero = new FondoFinanciero(precio);
        encontrarCooperativa = new Cooperativa(precio);
        encontrarArquitecto = new Arquitecto(precio,date);
        encontrarNotario = new Notario(precio,date);
    }

    public void find(){

        encontrarBanco.findBanco();
        econtrarAbogado.abogadosDisponibles();
        encontrarFondoFinanciero.findFondoFinanciero();
        encontrarCooperativa.findCooporativa();
        encontrarNotario.notariosDisponibles();
        encontrarArquitecto.arquitectosDisponibles();

    }
}
