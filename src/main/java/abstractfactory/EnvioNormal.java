package main.java.abstractfactory;

import main.java.factory.LibroDigital;
import main.java.factory.LibroFisico;

public class EnvioNormal implements MetodoEnvio{

    @Override
    public void tipoEnvio() {
            System.out.println("Se realiza envio normal");
    }
}
