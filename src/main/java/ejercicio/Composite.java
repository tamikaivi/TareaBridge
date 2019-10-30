package ejercicio;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> list = new ArrayList<>();

    private int accEsriamccion;

    public Composite(String name) {
        super(name,0,"","");
    }


    @Override
    public void imprimir() {


        System.out.println("" +this.getName()+" "+this.getEstimacion());
        // some actions when we do iteration with list
        for (Component comp: list) {
            accEsriamccion= accEsriamccion+comp.getEstimacion();
            this.setEstimacion(accEsriamccion);
            comp.imprimir();

        }

    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getName());
    }
}