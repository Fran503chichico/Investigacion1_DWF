package pedidohexagonalspring.infraestructura.salida;

import org.springframework.stereotype.Repository;
import pedidohexagonalspring.dominio.modelo.Pedido;
import pedidohexagonalspring.dominio.puerto.salida.PedidoRepositorio;
import pedidohexagonalspring.infraestructura.salida.jpa.PedidoRepositorioJpa;

@Repository

public class PedidoRepositorioAdaptador implements PedidoRepositorio {

    private final PedidoRepositorioJpa jpaRepo;

    public PedidoRepositorioAdaptador(PedidoRepositorioJpa jpaRepo) {
        this.jpaRepo = jpaRepo;
    }

    @Override
    public void guardar(Pedido pedido) {
        jpaRepo.save(pedido);
    }
}
