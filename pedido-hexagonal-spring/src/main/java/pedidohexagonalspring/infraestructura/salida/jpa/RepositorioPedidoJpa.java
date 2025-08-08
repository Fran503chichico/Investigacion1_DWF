package pedidohexagonalspring.infraestructura.salida.jpa;

import org.springframework.stereotype.Repository;
import pedidohexagonalspring.dominio.modelo.Pedido;
import pedidohexagonalspring.dominio.puerto.salida.GuardarPedidoRepositorio;

@Repository

public class RepositorioPedidoJpa implements GuardarPedidoRepositorio {

    private final PedidoRepositorioJpa pedidoRepositorioJpa;

    public RepositorioPedidoJpa(PedidoRepositorioJpa pedidoRepositorioJpa) {
        this.pedidoRepositorioJpa = pedidoRepositorioJpa;
    }

    @Override
    public void guardar(Pedido pedido) {
        pedidoRepositorioJpa.save(pedido);
        System.out.println("Pedido guardado en la base de datos: " + pedido.getDescripcion());
    }
}
