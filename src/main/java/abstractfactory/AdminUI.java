package main.java.abstractfactory;

public class AdminUI implements InterfazUI{
    @Override
    public void loguearse() {
        System.out.println("Se ha creado un Admin.");
    }
}
