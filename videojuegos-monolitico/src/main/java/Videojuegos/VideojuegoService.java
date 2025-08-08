package Videojuegos;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideojuegoService {

    private final List<Videojuego> lista = new ArrayList<>();

    public VideojuegoService() {
        // Juegos agregados automáticamente
        lista.add(new Videojuego("God of War", "Acción", "PlayStation", 59.99));
        lista.add(new Videojuego("Zelda: Breath of the Wild", "Aventura", "Nintendo Switch", 69.99));
        lista.add(new Videojuego("Halo Infinite", "Shooter", "Xbox", 49.99));
        lista.add(new Videojuego("The Witcher 3", "RPG", "PC", 39.99));
    }

    public Videojuego guardar(Videojuego videojuego) {
        lista.add(videojuego);
        return videojuego;
    }

    public List<Videojuego> obtenerTodos() {
        return lista;
    }
}