package ejercicio;

public class Client2 {
    public static void main(String[] args) {


         Banco encontrarBanco;
         Abogado econtrarAbogado;
         FondoFinanciero encontrarFondoFinanciero;
         Cooperativa encontrarCooperativa;
         Arquitecto encontrarArquitecto;
         Notario encontrarNotario;

        encontrarBanco = new Banco(3000);
        econtrarAbogado = new Abogado(3000,"octubre");
        encontrarFondoFinanciero = new FondoFinanciero(3000);
        encontrarCooperativa = new Cooperativa(3000);
        encontrarArquitecto = new Arquitecto(3000,"octubre");
        encontrarNotario = new Notario(3000,"octubre");

		encontrarBanco.findBanco();
		encontrarArquitecto.arquitectosDisponibles();
		econtrarAbogado.abogadosDisponibles();
		encontrarCooperativa.findCooporativa();
		encontrarNotario.notariosDisponibles();
		encontrarFondoFinanciero.findFondoFinanciero();

   }

}
