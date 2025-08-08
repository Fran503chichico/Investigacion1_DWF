package Videojuegos;

import org.springframework.data.jpa.repository.JpaRepository;
import Videojuegos.Videojuego;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Long> {
}