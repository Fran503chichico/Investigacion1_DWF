package Videojuegos;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/videojuegos")
public class VideojuegoController {

    private final VideojuegoService service;

    public VideojuegoController(VideojuegoService service) {
        this.service = service;
    }

    @PostMapping
    public Videojuego crear(@RequestBody Videojuego videojuego) {
        return service.guardar(videojuego);
    }

    @GetMapping
    public List<Videojuego> listar() {
        return service.obtenerTodos();
    }
}
