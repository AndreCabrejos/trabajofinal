package proyecto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

public class Movimiento {
    private Dependencia origen;
    private Dependencia destino;
    private String fecha;

    public Movimiento(Dependencia origen, Dependencia destino) {
        this.origen = origen;
        this.destino = destino;
        LocalDateTime fecha = LocalDateTime.now(); 
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String fechaFormateada = fecha.format(formato);
        this.fecha = fechaFormateada;
    }
   
    public Dependencia getOrigen() { 
        return origen;
     }
    public Dependencia getDestino() { 
        return destino;
     }
    public String getFecha() { 
        return fecha; 
    }
}
