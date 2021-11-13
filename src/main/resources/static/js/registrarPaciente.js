$(document).ready(function() {
   // on ready

});


async function registrarPaciente() {
  let datos = {};

   //obtener true o false de txtSexo
     let s = true;
     if(document.querySelector('input[name="rBtnSexo"]:checked').value == "0"){
       s=false;
     }

  datos.nombre_paciente = document.getElementById('txtNombre').value;
  datos.apellido = document.getElementById('txtApellido').value;
  datos.fecha_nacimiento = document.getElementById('txtFechaNacimiento').value;
  datos.lugar_nacimiento = document.getElementById('txtLugarNacimiento').value;
  datos.sexo = s;
  datos.estado_civil = document.getElementById('txtEstadoCivil').value;
  datos.escolaridad = document.getElementById('txtEscolaridad').value;
  datos.ocupacion = document.getElementById('txtOcupacion').value;
  datos.direccion = document.getElementById('txtDireccion').value;
  datos.id_municipio = document.getElementById('txtMunicipio').value;
  datos.id_departamento = document.getElementById('txtDepartamento').value;
  datos.clinica_referido = document.getElementById('txtClinica').value;
  datos.telefono = document.getElementById('txtTelefono').value;
  datos.dui = document.getElementById('txtDUI').value;
  datos.isss = document.getElementById('txtISSS').value;
  datos.activo=true;

  const request = await fetch('paciente', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });
  console.log(datos);
  alert("El paciente fue agregado con exito");
  window.location.href = 'Paciente.html'

}
async function registrarUsuario(){
alert(document.querySelector('input[name="rBtnSexo"]:checked').value.toInt());
console.log(document.querySelector('input[name="rBtnSexo"]:checked').value.toInt());
}
