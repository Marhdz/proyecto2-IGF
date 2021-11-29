package com.proyectoDos.proyecto.dao;

import com.proyectoDos.proyecto.models.Pedido;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
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

    @Override
    public Pedido getPedidosByMed(Integer id_medicamento) {
        String query = "SELECT p FROM Pedido p WHERE p.id_medicamento = :id_med ORDER BY p.id_pedido DESC ";
        Pedido pedido;
        try {
           List<Pedido> result = entityManager.createQuery(query).setParameter("id_med", id_medicamento).getResultList();
           pedido = result.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            pedido = null;
        }
        return pedido;

    }

}
