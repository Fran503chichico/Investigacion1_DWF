package pedidohexagonalspring.dominio.puerto.salida;

import pedidohexagonalspring.dominio.modelo.Pedido;

public interface GuardarPedidoRepositorio {
    void guardar(Pedido pedido);
}
