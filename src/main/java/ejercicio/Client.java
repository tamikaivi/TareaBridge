package ejercicio;

public class Client {
    public static void main(String[] args) {

        SolicitudPrestamo agencia = new SolicitudPrestamo(23, "octubre");
        agencia.find();
		/*Banco enconctrarHotel1 = new Banco("abc");
		Abogado encontrarAuto = new Abogado("auto", "noviembre");
		FondoFinanciero encontrarSeguro = new FondoFinanciero("20bs", "mayo");
		Cooperativa encontrarVuelo = new Cooperativa("abc", "octubre");
		
		enconctrarHotel1.findBanco();
		encontrarAuto.rentACar();
		encontrarSeguro.arquitectosDisponibles();
		encontrarVuelo.findCooporativa();*/

    }

}
