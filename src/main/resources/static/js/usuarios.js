// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
  $('#usuarios').DataTable();
  actualizarEmailDelUsuario();
});

function actualizarEmailDelUsuario() {
    document.getElementById('txt-email-usuario').outerHTML = localStorage.email;
}


async function cargarUsuarios() {
  const request = await fetch('api/v1/departamento', {
    method: 'GET',
    headers: getHeaders()
  });
  const departamentos = await request.json();


  let listadoHtml = '';
  for (let departamento of departamentos) {
//    let botonEliminar = '<a href="#" onclick="eliminarUsuario(' + usuario.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

//    let telefonoTexto = usuario.telefono == null ? '-' : usuario.telefono;
    let usuarioHtml = '<tr><td>'+departamento.id_departamento+'</td><td>' + departamento.nombre_departamento +  '</td></tr>';
    listadoHtml += usuarioHtml;
  }

document.querySelector('#usuarios tbody').outerHTML = listadoHtml;

console.log(departamentos)
}

function getHeaders() {
    return {
     'Accept': 'application/json',
     'Content-Type': 'application/json',
     'Authorization': localStorage.token
   };
}

async function eliminarUsuario(id) {

  if (!confirm('¿Desea eliminar este usuario?')) {
    return;
  }

 const request = await fetch('api/usuarios/' + id, {
    method: 'DELETE',
    headers: getHeaders()
  });

  location.reload()
}