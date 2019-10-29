package ejercicio;

public class Proxy implements IBanco {
    private Persona persona;
    private Banco banco =null;

    public Proxy (Persona persona){
        this.persona = persona;
    }

    @Override
    public void depositar() {
        String bo = FactoryMoneda.make(FactoryMoneda.tipo.BOLIVIANOS).create();
        String eu = FactoryMoneda.make(FactoryMoneda.tipo.EURO).create();
        String sus = FactoryMoneda.make(FactoryMoneda.tipo.DOLAR).create();

        if (banco == null){
            banco = new Banco(persona);
        }
        //some conditions //filters
        if (persona.getTipoMoneda().equals(bo)) {
            this.banco.depositar();
        }else if (persona.getTipoMoneda().equals(eu)){
            System.out.println("No puede realizar el deposito en euros porfavor deposite "+ persona.getMonto()*8+" Bs.");
        }else if (persona.getTipoMoneda().equals(sus)){
            System.out.println("No puede realizar el deposito en dolares porfavor deposite "+ persona.getMonto()*7+" Bs.");
        }else {
            System.out.println("No puede realizar el deposito no exite esta moneda en mi pais");
        }


    }

    @Override
    public void retirar() {
        String bo = FactoryMoneda.make(FactoryMoneda.tipo.BOLIVIANOS).create();
        String eu = FactoryMoneda.make(FactoryMoneda.tipo.EURO).create();
        String sus = FactoryMoneda.make(FactoryMoneda.tipo.DOLAR).create();

        if (banco == null){
            banco = new Banco(persona);
        }
        //some conditions //filters
        if (persona.getTipoMoneda().equals(bo)) {
            this.banco.depositar();
        }else if (persona.getTipoMoneda().equals(eu)){
            System.out.println("No puede realizar el retiro en euros porfavor retire "+ persona.getMonto()*8+" Bs.");
        }else if (persona.getTipoMoneda().equals(sus)){
            System.out.println("No puede realizar el retiro en dolares porfavor retire "+ persona.getMonto()*7+" Bs.");
        }else {
            System.out.println("No puede realizar el retiro no exite esta moneda en mi pais");
        }
    }
}
