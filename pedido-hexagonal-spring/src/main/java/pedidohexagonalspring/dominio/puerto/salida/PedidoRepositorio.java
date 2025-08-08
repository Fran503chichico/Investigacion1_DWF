package pedidohexagonalspring.dominio.puerto.salida;

import pedidohexagonalspring.dominio.modelo.Pedido;

public interface PedidoRepositorio {
    void guardar(Pedido pedido);
}
