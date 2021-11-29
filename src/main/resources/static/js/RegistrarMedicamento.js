// Call the dataTables jQuery plugin
$(document).ready(function() {
//    registrarMedicamento();
//  $('#medicamento').DataTable();
});

async function registrarMedicamento(){
    let datos = {};

        datos.acronimo = document.getElementById('txtacronimo').value;
        datos.nombre_medicamento = document.getElementById('txtnnombre').value;
        datos.laboratorio = document.getElementById('txtlaboratorio').value;
        datos.concentracion = document.getElementById('txtdosis').value;
        datos.presentacion = document.getElementById('lstpresentacion').value;
        datos.vencimiento =  document.getElementById('fecha').value;
        datos.cantidad =  document.getElementById('nbcantidad').value;

         console.log(datos);
       const request = await fetch('api/v1/medicamento', {
         method: 'POST',
         headers: {
           'Accept': 'application/json',
           'Content-Type': 'application/json'
         },
         body: JSON.stringify(datos)
       });
       window.location.href = 'ListadoMedicamentos.html'
}

function getHeaders() {
    return {
     'Accept': 'application/json',
     'Content-Type': 'application/json',
     'Authorization': localStorage.token
   };
}