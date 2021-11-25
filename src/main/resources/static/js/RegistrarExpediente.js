$(document).ready(function() {
   // on ready

});


async function registrarExpediente() {
  let datos = {};

   //obtener true o false del radio button
     al = false;
     if(document.querySelector('input[name="rBtnAlimentacion"]:checked').value == "0"){
       al=true;
     }
     ag = false;
          if(document.querySelector('input[name="rBtnAgua"]:checked').value == "0"){
            ag=true;
     }

  datos.alimentacion = al;
  datos.dieta = document.getElementById('txtDieta').value;
  datos.peso = document.getElementById('txtPeso').value;
  datos.talla = document.getElementById('txtTalla').value;
  datos.agua_cantidad = document.getElementById('txtAguaC').value;
  datos.agua_estado = ag;
//  datos.cafe_cantidad = document.getElementById('txtCafeC').value;
//  datos.cafe_fecha_inicio = document.getElementById('txtCafeF').value;
//  datos.alcohol_cantidad = document.getElementById('txtAlcoholC').value;
//  datos.alcohol_fecha_inicio = document.getElementById('txtAlcoholF').value;
//  datos.alcohol_tipo = document.getElementById('txtAlcoholT').value;
//  datos.tabaco_cantidad = document.getElementById('txtTabacoC').value;
//  datos.tabaco_fecha_inicio = document.getElementById('txtTabacoF').value;
//  datos.prueba_rapida = document.getElementById('txtPruebaR').value;
//  datos.elisa = document.getElementById('txtELISA').value;

  const request = await fetch('expediente/{id}', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });
  console.log(datos);
  alert("El expediente fue agregado con exito");
  //Pantalla a la que lleva despues de crear el paciente
  window.location.href = 'Paciente.html'

}
