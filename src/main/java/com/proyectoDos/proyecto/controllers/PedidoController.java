package com.proyectoDos.proyecto.controllers;

import com.proyectoDos.proyecto.dao.PedidoDao;
import com.proyectoDos.proyecto.models.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
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

    @PostMapping(value = "{id}")
    public void createPedido(@PathVariable Integer id , @RequestBody Pedido pedido){
        Integer cantidadInicial = pedido.getCantidad_inicial();
        if(pedidoDao.getPedidosByMed(id) != null) {
            Pedido pedidoAnterior = pedidoDao.getPedidosByMed(id);
            pedido.setId_pedido_anterior(pedidoAnterior.getId_pedido());
            pedido.setExistencias(pedidoAnterior.getExistencias() + cantidadInicial);
        } else {
            pedido.setExistencias(cantidadInicial);
        }
        pedido.setId_medicamento(id);
        pedido.setPeriodo(Date.valueOf(LocalDate.now()));
        pedidoDao.postPedido(pedido);
    }

    @GetMapping(value = "nuevo/{id}")
    public String nuevoPedido(@PathVariable Integer id){
        return "html/ControlDeInventario.html";
    }



    @PostMapping(value = "update/{id}")
    public void updatePedido(@PathVariable("id") Integer id_pedido, @RequestBody Pedido pedido){
        pedido.setId_pedido(id_pedido);
        pedidoDao.postPedido(pedido);
    }



}