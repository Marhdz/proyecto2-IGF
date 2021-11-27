package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Pedido;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface PedidoDao {
    List<Pedido> getPedidos();

    Pedido getPedido(Integer id);

    void postPedido(Pedido pedido);
}
