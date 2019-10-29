package ejercicio;

public class FactoryMoneda {
    enum tipo {
        EURO,
        BOLIVIANOS,
        DOLAR
    }
    public static Moneda make(tipo type){

        Moneda product;
        switch (type){
            case EURO:
                product = new Dolar();
                break;
            case BOLIVIANOS:
                product = new Bolivianos();
                break;
            case DOLAR:
                product = new Euro();
                break;
            default:
                product = new Bolivianos();
                break;
        }
        return product;
    }
}
