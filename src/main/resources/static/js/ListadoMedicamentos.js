// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarListadoMedicamentos();
  $('#medicamento').DataTable();
});

async function cargarListadoMedicamentos();{
    const request = await fetch('Listado de medicamentos', {
        method: 'GET',
        headers: getHeaders()
    });
    const listadoMedicamentos = await request.json();

   let listadoHtml = ' ';
     for (let medicamento of medicamentos) {

       let medicamentoHtml = '<tr><td>'+medicamento.id_medicamento+'</td><td>' + medicamento.acronimo + ' ' + medicamento.nombre_medicamento + '</td><td>'
                       + medicamento.laboratorio+'</td><td>'+ medicamento.concentracion+'</td><td>'+ medicamento.presentacion+'</td><td>'
                       + medicamento.vencimiento+'</td><td>'+ medicamento.cantidad+'</td></tr>';
       listadoHtml += medicamentoHtml;
     }
     document.querySelector('#medicamentos tbody').outerHTML = listadoHtml;

     console.log(medicamentos)
}

function getHeaders() {
    return {
     'Accept': 'application/json',
     'Content-Type': 'application/json',
     'Authorization': localStorage.token
   };
}