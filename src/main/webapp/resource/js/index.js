//function fileInput(event) {
//	let video = event.target.files[0];
//	let fileReader = new FileReader();
//	fileReader.onload = function(){
//		let dataURL = fileReader.result;
//		document.forms.form.file.value = dataURL;
//		console.log(document.forms.form.file.value);
//	};
//	fileReader.readAsDataURL(video);
//}

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
      document.forms.form.imagem.value = dataURL;
      console.log(document.forms.form.imagem.value);
     
    };
    reader.readAsDataURL(file);
}
