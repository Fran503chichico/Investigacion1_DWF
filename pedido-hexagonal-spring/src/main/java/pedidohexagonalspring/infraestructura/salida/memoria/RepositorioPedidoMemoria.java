package pedidohexagonalspring.infraestructura.salida.memoria;

import pedidohexagonalspring.dominio.modelo.Pedido;
import pedidohexagonalspring.dominio.puerto.salida.GuardarPedidoRepositorio;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RepositorioPedidoMemoria implements GuardarPedidoRepositorio {

    private final Map<String, Pedido> baseDatos = new HashMap<>();

    @Override
    public void guardar(Pedido pedido) {
        baseDatos.put(pedido.getId(), pedido);
        System.out.println("Pedido guardado en memoria: "+pedido.getDescripcion());
    }
}
