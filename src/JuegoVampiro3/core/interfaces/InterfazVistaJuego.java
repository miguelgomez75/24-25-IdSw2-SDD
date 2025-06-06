package JuegoVampiro3.core.interfaces;

import JuegoVampiro3.core.Arma;
import JuegoVampiro3.ui.CredencialesUsuario;
import java.util.List;

public interface InterfazVistaJuego {
    void mostrarMensaje(String mensaje);
    void mostrarTitulo();
    void mostrarMenuInicial();
    void mostrarMenuJuego(String usuario);
    void mostrarInformacionJuego();
    void mostrarEstadoBatalla(InterfazLuchador heroe, InterfazPersonaje vampiro);
    void mostrarResultadoFinal(String mensaje);
    
    int leerOpcion();
    CredencialesUsuario pedirCredenciales(String titulo);
    int pedirAccionGuerrero();
    int pedirSeleccionArma(List<Arma> armas);
    
    void cerrarRecursos();
} 
