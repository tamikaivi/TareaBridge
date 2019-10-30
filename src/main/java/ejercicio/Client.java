package ejercicio;

public class Client {
    public static void main(String []args){
        Composite subTask = new Composite("Sub Task");
        subTask.add(new Item("Item 1",4,"Descrip cion 1","Titulo 1"));



        Composite task = new Composite(" Task ");
        task.add(subTask);


        Composite userHostori = new Composite("User Story");

        userHostori.add(task);

        userHostori.imprimir();
    }
}