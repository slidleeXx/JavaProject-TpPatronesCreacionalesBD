package main.java.builder;


public class Usuario implements Cloneable {

    private final String nombre,
            direccion,
            email,
            fechaNacimiento;
    private final float telefono;

    // Builder
    private Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.direccion = builder.direccion;
        this.email = builder.email;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.telefono = builder.telefono;
    }


    public static class Builder {
        private final String nombre;
        private String direccion ;
        private String email;
        private final String fechaNacimiento;
        private float telefono;

        public Builder(String nombre, String fechaNacimiento) {
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
        }

        public Builder setDireccion(String direccion) { this.direccion = direccion; return this; }
        public Builder setEmail(String email) { this.email = email; return this; }
        public Builder setTelefono(float telefono) { this.telefono = telefono; return this; }

        public Usuario build(){return new Usuario(this);}
    }




    // Prototype 
    @Override
    public Usuario clone (){

        try {
            return (Usuario) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public float getTelefono() {
        return telefono;
    }


}
