// response keys are success, codigo, placa, probablity
let url = "https://my-json-server.typicode.com/andregomesp/fakeapi/results";
let method = "POST";

function clickForPhoto() {
    let el = document.getElementById("photo");
    el.click();
}

function treatResults(results) {
  let el = document.getElementById("response-box");
  if (results.success) {
    el.innerText = "A placa foi identificada como " + results.placa + " com " + results.probability + " de certeza";
  } else {
    el.innerText = "Não foi possível identificar a placa"
  }
}

function sendPhoto(event) {
    console.log(event);
    let file = event.target.files[0];
    let reader = new FileReader();
    reader.onload = function(){
      let dataURL = reader.result;
      let output = document.getElementById('photo-show');
      output.src = dataURL;
      document.forms.form.imagem.value = output.src;
      console.log(document.forms.form.imagem.value);
      
     // fetch(url, {mode: "cors", body: JSON.stringify({image: dataURL}), method: method})
      // fetch(url, {mode: "cors", method: "GET"})
     // .then(
       // response => response.json()
       // .then(json => treatResults(json))
       // .catch(err => console.log(err))
     // )
      //.catch(err => console.log(err))

    };
    reader.readAsDataURL(file);
}
