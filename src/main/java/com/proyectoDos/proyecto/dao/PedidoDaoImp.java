package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Pedido;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class PedidoDaoImp implements PedidoDao{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Pedido> getPedidos() {
        String query = "FROM Pedido";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Pedido getPedido(Integer id) {
        return entityManager.find(Pedido.class, id);
    }

    @Override
    public void postPedido(Pedido pedido) {
        entityManager.merge(pedido);
    }

}
