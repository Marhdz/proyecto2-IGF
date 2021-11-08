// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarPacientes();
  $('#paciente').DataTable();
});

async function cargarPacientes() {
    const request = await fetch('paciente', {
        method: 'GET',
        headers: getHeaders()
    });
    const pacientes = await request.json();

   let listadoHtml = ' ';
     for (let paciente of pacientes) {

       let pacienteHtml = '<tr><td>'+paciente.id_paciente+'</td><td>' + paciente.nombre_paciente + ' ' + paciente.apellido + '</td><td>'
                       + paciente.fecha_nacimiento+'</td><td>'+ paciente.lugar_nacimiento+'</td><td>'+ paciente.sexo+'</td><td>'
                       + paciente.estado_civil+'</td><td>'+ paciente.escolaridad+'</td><td>'+paciente.ocupacion+'</td><td>'
                       + paciente.direccion+'</td><td>'+ paciente.id_municipio+'</td><td>'+ paciente.id_departamento+'</td><td>'
                       + paciente.clinica_referido+'</td><td>'+ paciente.telefono+'</td><td>'+ paciente.dui+'</td><td>'
                       + paciente.isss+'</td><td>'+ paciente.responsable+'</td><td>'+ paciente.parentesco+'</td><td>'
                       + paciente.id_expediente+'</td><td>'+paciente.activo+'</td></tr>';
       listadoHtml += pacienteHtml;
     }
     document.querySelector('#pacientes tbody').outerHTML = listadoHtml;

     console.log(pacientes)
}

function getHeaders() {
    return {
     'Accept': 'application/json',
     'Content-Type': 'application/json',
     'Authorization': localStorage.token
   };
}