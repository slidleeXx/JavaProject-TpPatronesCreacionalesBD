package main.java.factory;


public class LibroFisico extends Libro {

    public LibroFisico(String nombre , String autor , String formato) {
        super.setNombre(nombre);
        super.setAutor(autor);
        super.setFormato(formato);
    }


    public void mostrarInfoDisp (){

        System.out.println("Libro Fisico ver Disponibilidad en Biblioteca");
        super.mostrarInfo();
    }




}
