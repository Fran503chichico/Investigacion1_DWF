package pedidohexagonalspring.infraestructura.entrada.web;

import pedidohexagonalspring.dominio.puerto.entrada.CrearPedidoCasoUso;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")

public class PedidoController {

    private final CrearPedidoCasoUso crearPedido;

    public PedidoController(CrearPedidoCasoUso crearPedido) {
        this.crearPedido = crearPedido;
    }

    @PostMapping
    public String crearPedido(@RequestParam String id, @RequestParam String descripcion) {
        crearPedido.crearPedido(id, descripcion);
        return "Pedido creado con ID: "+id;
    }

}
