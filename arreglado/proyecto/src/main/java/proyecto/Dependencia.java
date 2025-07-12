package proyecto;

public class Dependencia {
    private String nombre;
    private String codigo;

    public Dependencia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() { 
        return nombre; 
    }
    public String getCodigo() { 
        return codigo;
    }
    public String toString() { 
        return nombre + " (" + codigo + ")";
     }
}
    
