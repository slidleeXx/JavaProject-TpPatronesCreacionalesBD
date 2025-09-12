package main.java.factory;

public class LibroDigital extends Libro {

    public LibroDigital(String nombre , String autor , String formato) {
        super.setNombre(nombre);
        super.setAutor(autor);
        super.setFormato(formato);
    }



    public void mostrarInfoDisp (){

        System.out.println("Libro Digital Adquirir Clave de Acceso a PDF ");
        super.mostrarInfo();
    }


}
