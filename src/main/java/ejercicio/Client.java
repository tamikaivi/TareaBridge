package ejercicio;

public class Client {
    public static void main (String [] args){
        // create proxy
        String mone = FactoryMoneda.make(FactoryMoneda.tipo.EURO).create();
        IBanco proxy = new Proxy(new Persona(mone,90));

        proxy.depositar();
        proxy.retirar();

        String mone1 = FactoryMoneda.make(FactoryMoneda.tipo.BOLIVIANOS).create();
        IBanco proxy1 = new Proxy(new Persona(mone1,90));

        proxy1.depositar();
        proxy1.retirar();

        String mone2 = FactoryMoneda.make(FactoryMoneda.tipo.DOLAR).create();
        IBanco proxy2 = new Proxy(new Persona(mone2,90));

        proxy2.depositar();
        proxy2.retirar();
    }
}
