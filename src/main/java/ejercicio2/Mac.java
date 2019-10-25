package ejercicio2;

public class Mac implements IPlataforma {

    private IArquitectura arquitectura;

    public Mac(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void crearPlataforma() {
        System.out.print("Creando Plataforma Mac");
        arquitectura.crearArquitectura();
    }

   }
