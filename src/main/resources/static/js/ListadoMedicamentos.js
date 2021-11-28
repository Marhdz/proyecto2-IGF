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
        console.log(medicamento.vencimiento.getYear);
       let medicamentoHtml = '<tr><td>' + medicamento.acronimo + '</td><td>'   + medicamento.nombre_medicamento + '</td><td>'
                       + medicamento.laboratorio+'</td><td>'+ medicamento.concentracion+'</td><td>'+ medicamento.presentacion+'</td><td>'
                       + medicamento.vencimiento+'</td><td>'+ medicamento.cantidad+'</td></tr>';
       listadoHtml += medicamentoHtml;
     }
     document.querySelector('#medicamento tbody').outerHTML = listadoHtml;

     console.log(medicamentos);
}

function getHeaders() {
    return {
     'Accept': 'application/json',
     'Content-Type': 'application/json',
     'Authorization': localStorage.token
   };
}