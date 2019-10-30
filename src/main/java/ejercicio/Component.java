package ejercicio;

abstract class Component {
    private String name;
    private int estimacion;
    private String descricion;
    private String titulo;
    public Component(String name, int estimacion, String descricion, String titulo)    {
        this.name = name;
        this.estimacion=estimacion;
        this.descricion=descricion;
        this.titulo = titulo;
        System.out.println("Constructor " + name);
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstimacion() {
        return estimacion;
    }

    public void setEstimacion(int estimacion) {
        this.estimacion = estimacion;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract void imprimir();
    public abstract void add(Component component);
    public abstract void remove (Component component);
    public abstract void getChild(int position);
}