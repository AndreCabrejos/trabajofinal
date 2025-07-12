package proyecto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;

public class TramiteController {
    private Queue<Expediente> cola;

    public TramiteController() {
        cola = new LinkedList<>();
    }

    public void registrarExpediente(Expediente expediente) {
        cola.add(expediente);
    }

    public void moverExpediente(Expediente e, Dependencia origen, Dependencia destino) {
        e.agregarMovimiento(new Movimiento(origen, destino));
    }

    public void insertarOrdenadoR(Expediente nuevo) {
        // Convertimos la cola a LinkedList temporal para poder insertar por índice
        LinkedList<Expediente> lista = new LinkedList<>(cola);
        insertarOrdenado(lista, nuevo);
        cola = new LinkedList<>(lista); // actualizamos la cola con el nuevo orden
    }

    public void insertarOrdenado(LinkedList<Expediente> lista, Expediente nuevo) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        if (nuevo.estaFinalizado()) {
            lista.addLast(nuevo);
            return;
        }

        LocalDateTime fechaNuevo = LocalDateTime.parse(nuevo.getFechaInicio(), formatter);
        int i = 0;

        for (Expediente e : lista) {
            if (e.estaFinalizado()) break;

            if (nuevo.getPrioridad() < e.getPrioridad()) break;
            if (nuevo.getPrioridad() > e.getPrioridad()) {
                i++;
                continue;
            }

            LocalDateTime fechaActual = LocalDateTime.parse(e.getFechaInicio(), formatter);
            if (fechaNuevo.isAfter(fechaActual)) break;

            i++;
        }

        lista.add(i, nuevo);
    }

    public void finalizarExpediente(Expediente e) {
        e.finalizar();
        cola.remove(e);
        insertarOrdenadoR(e);
    }

    public Expediente buscarPorId(int idBuscado) {
        for (Expediente exp : cola) {
            if (exp.getId() == idBuscado) {
                return exp;
            }
        }
        return null;
    }

    public LinkedList<Expediente> obtenerTodos() {
        return new LinkedList<>(cola);
    }

    // Si más adelante deseas exponer la cola (solo lectura), podrías hacerlo así:
    // public Queue<Expediente> getCola() {
    //     return new LinkedList<>(cola); // copia para evitar modificaciones externas
    // }
}
