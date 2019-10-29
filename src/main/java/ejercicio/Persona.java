package ejercicio;

public class Persona {

    private String tipoMoneda;
    private int monto;

    public Persona(String tipoMoneda, int monto) {
        this.tipoMoneda = tipoMoneda;
        this.monto = monto;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
}
