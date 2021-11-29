// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarListadoMedicamentos();
  $('#medicamento').DataTable();
});

async function cargarListadoMedicamentos(){
    const request = await fetch('api/v1/medicamento/', {
        method: 'GET',
        headers: getHeaders()
    });
    const medicamentos = await request.json();

   let listadoHtml = ' ';
     for (let medicamento of medicamentos) {

     let botonPedido = '<a href="ControlDeInventario.html" class="btn btn-primary btn-circle btn-sm"><i onclick="cargarPedidoAnterior(' + medicamento.id_medicamento + ')" class="fas fa-trash"></i></a>';
       let medicamentoHtml = '<tr><td>' + medicamento.acronimo + '</td><td>'   + medicamento.nombre_medicamento + '</td><td>'
                       + medicamento.laboratorio+'</td><td>'+ medicamento.concentracion+'</td><td>'+ medicamento.presentacion+'</td><td>'
                       + medicamento.vencimiento.substring(0, 7)+'</td><td>'+ medicamento.cantidad+'</td><td>'+ botonPedido+'</td></tr>';
       listadoHtml += medicamentoHtml;

     console.log(medicamento.id_medicamento);
     }
     document.querySelector('#medicamento tbody').outerHTML = listadoHtml;

}

function getHeaders() {
    return {
     'Accept': 'application/json',
     'Content-Type': 'application/json',
     'Authorization': localStorage.token
   };
}

function cargarPedidoAnterior(id){
    console.log(id);
    $(document).ready(function(id) {
            cargarPedidoAnterior(id);
            RegistrarPedido(id)
            $('#pedidoAnterior')
    });
}

async function cargarPedidoAnterior(id){

    const request = await fetch('api/v1/pedido/' +id, {
        method: 'GET',
        headers: getHeaders()
    });
    const ant = await request.json();
    console.log(id);
   let pedidoHtml = '<div> <h5>Año actual: <br>yyyy</h5><br> <h5>Periodo actual desde: <br>dd/mm/yy hasta dd/mm/yy</h5><br>'+
                                         '<h5>Periodo anterior' + ant.cantidad_inicial +'</h5><br>'+
                                        ' <h5>Cantidad adquirida periodo anterior: <br>0 paquetes de 0 mg</h5><br>'+
                                        ' <h5>Existencias periodo anterior: <br>0 paquetes de 0 mg</h5><br>'+
                                        ' <h5>Cantidad adquirida periodo actual: <br>0 paquetes de 0 mg</h5><br>'+
                                        ' <h5>Total de inventario a inicio del periodo actual: <br>0 paquetes de 0 mg</h5><br>'+
                                        ' <h5>Medicamento retirado: <br>0 paquetes de 0 mg</h5><br>'+
                                        ' <h5>Total inventario actual: <br>0 paquetes de 0 mg</h5><br></div>';

     document.querySelector('#pedidoAnterior div').outerHTML = pedidoHtml;

     console.log(medicamentos);
}

async function RegistrarPedido(id){
    let datos = {};

        datos.cantidad_inicial = document.getElementById('nbcantidad').value;

         console.log(datos);
       const request = await fetch('api/v1/pedido/'+id, {
         method: 'POST',
         headers: {
           'Accept': 'application/json',
           'Content-Type': 'application/json'
         },
         body: JSON.stringify(datos)
       });
       console.log("dis "+id_pedidoAnterior);
       window.location.href = 'ListadoMedicamentos.html'
}