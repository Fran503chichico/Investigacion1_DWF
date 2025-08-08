package pedidohexagonalspring.aplicacion.servicio;

import pedidohexagonalspring.dominio.modelo.Pedido;
import pedidohexagonalspring.dominio.puerto.entrada.CrearPedidoCasoUso;
import pedidohexagonalspring.dominio.puerto.salida.GuardarPedidoRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;

@Service

public class CrearPedidoServicio implements CrearPedidoCasoUso {

    private final GuardarPedidoRepositorio repositorio;

    public CrearPedidoServicio(@Qualifier("repositorioPedidoJpa") GuardarPedidoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public void crearPedido(String id, String descripcion) {
        Pedido pedido = new Pedido(id, descripcion);
        repositorio.guardar(pedido);
    }
}
