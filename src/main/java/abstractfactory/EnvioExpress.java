package main.java.abstractfactory;

public class EnvioExpress implements MetodoEnvio{
    @Override
    public void tipoEnvio() {
            System.out.println("Se realiza envio express");
    }
}
