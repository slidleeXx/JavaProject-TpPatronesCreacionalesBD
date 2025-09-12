package main.java.prototype;
import main.java.builder.Usuario;
import main.java.factory.Libro;


public class Prestamo implements Cloneable{
    Libro libro;
    Usuario usuario;
    private String fechaInicio;
    private String fechaFin;

    public Prestamo(Libro libro, Usuario usuario, String fechaInicio, String fechaFin) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }


    public void mostrar() {
        System.out.println("\nNombre Usuario : " + usuario.getNombre());
        libro.mostrarInfo();

    }

    // Prototype
    @Override
    public Object clone() {
        try {
            Prestamo prestamoclone = (Prestamo) super.clone();
            prestamoclone.libro = (Libro) libro.clone();
            prestamoclone.usuario = (Usuario) usuario.clone();
            return prestamoclone ;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    // Getters y Setters

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
