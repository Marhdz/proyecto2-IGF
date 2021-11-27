package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.PedidoDao;
import com.proyectoDos.proyecto.models.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/pedido")
public class PedidoController {

    @Autowired
    private PedidoDao pedidoDao;

    @GetMapping
    public List<Pedido> getPedidos(){

        return pedidoDao.getPedidos();
    }

    @GetMapping(value = "{id}")
    public Pedido getPedido(@PathVariable("id") Integer id_pedido){
        return  pedidoDao.getPedido(id_pedido);
    }

    @PostMapping
    public void createPedido(@RequestBody Pedido pedido){
        pedidoDao.postPedido(pedido);
    }

    @PostMapping(value = "{id}")
    public void updatePedido(@PathVariable("id") Integer id_pedido, @RequestBody Pedido pedido){
        pedido.setId_pedido(id_pedido);
        pedidoDao.postPedido(pedido);
    }



}