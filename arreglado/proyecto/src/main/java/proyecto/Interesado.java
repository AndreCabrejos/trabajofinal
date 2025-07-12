package proyecto;

public class Interesado {
    private String dni;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String email;
    private boolean esTrabajadorULima;

    public Interesado(String dni, String nombres,String apellidos , String telefono, String email, boolean esTrabajadorULima) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos=apellidos;
        this.telefono = telefono;
        this.email = email;
        this.esTrabajadorULima = esTrabajadorULima;

    }

    // Getters


    public String getDni() {
        return this.dni;
    }

    public String getNombres() {
        return this.nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean getEsTrabajadorULima() {
        return this.esTrabajadorULima;
    }

    public boolean isEsTrabajadorULima() {
        return this.esTrabajadorULima;
    }
   
    
}
