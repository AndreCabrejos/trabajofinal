package proyecto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
import java.util.LinkedList;

public class Expediente {
    private static int id_cont=0;
    private int id;
    private int prioridad; // 1=Alta, 2=Media, 3=Baja
    private Interesado interesado;
    private String asunto;
    private String documentoReferencia;
    private String fechaInicio;
    private String fechaFin;
    private LinkedList<Movimiento> seguimiento;

    public Expediente(int prioridad, Interesado interesado, String asunto, String documentoReferencia) {
        id=id_cont++;
        this.prioridad = prioridad;
        this.interesado = interesado;
        this.asunto = asunto;
        this.documentoReferencia = documentoReferencia;
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String fechaFormateada = fecha.format(formato);
        this.fechaInicio = fechaFormateada;
        this.seguimiento = new LinkedList<>();
    }

    public void agregarMovimiento(Movimiento movimiento) {
        seguimiento.add(movimiento);
    }

    public int getId() { 
        return id; 
    }
    public int getPrioridad() { 
        return prioridad; 
    }
    public Interesado getInteresado() { 
        return interesado; 
    }
    public String getAsunto() { 
        return asunto;
    }
    public String getDocumentoReferencia() { 
        return documentoReferencia;
    }
    public String getFechaInicio() { 
        return fechaInicio; 
    }
    public String getFechaFin() { 
        return fechaFin; 
    }
    public LinkedList<Movimiento> getSeguimiento() { 
        return seguimiento; 
    }

    public void finalizar() {
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String fechaFormateada = fecha.format(formato);
        this.fechaFin = fechaFormateada;
    }
    public boolean estaFinalizado() {
    return fechaFin != null;
} 
    public void moverA(Dependencia destino) {
    Dependencia origen;

    if (seguimiento.isEmpty()) {
        // Primer movimiento: usa oficina del usuario
        origen = new Dependencia( "Oficina de gestion", "GP00");
    } else {
        // Siguientes movimientos: el último destino es el nuevo origen
        origen = seguimiento.getLast().getDestino();
    }

    Movimiento movimiento = new Movimiento(origen, destino);
    seguimiento.add(movimiento);
}

    @Override
    public String toString() {
        return "[" + id + "] " + asunto + " - Prioridad: " + prioridad;
    }
}
