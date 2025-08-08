package pedidohexagonalspring.infraestructura.salida.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pedidohexagonalspring.dominio.modelo.Pedido;

public interface PedidoRepositorioJpa extends JpaRepository<Pedido, String> {
}
