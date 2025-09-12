package main.java.factory;


public abstract class Libro implements Cloneable {
    private String nombre;
    private String autor;
    private String formato;

    public  void mostrarInfo(){
        System.out.println("Libro -> Nombre: " + nombre+ " , Autor : "+autor + ", Formato : " + formato);
    }


    // Prototype
    @Override
    public Libro clone () {
        try {
            return (Libro) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    // Getters y Seters
    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
