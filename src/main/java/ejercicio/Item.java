package ejercicio;

public class Item extends Component {



    public Item(String name, int estimacion, String descricion, String titulo) {
        super(name, estimacion, descricion, titulo);
    }

    @Override
    public void imprimir() {
        System.out.println("\t Item : "+this.getEstimacion());
    }

    @Override
    public void add(Component component) {
        System.out.println("not applicable on Item");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable on Item");
    }

    @Override
    public void getChild(int position) {
        System.out.println("\t Item :"+this.getName());
    }
}
