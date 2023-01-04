function tocaSom(idElementoAudio) {
  document.querySelector(idElementoAudio).play();
}

//document.querySelector(".tecla_pom").onClick = tocaSomPom;

const listaDeTeclas = document.querySelectorAll(".tecla");

//let contador = 0;

// enquanto
/* while(contador < listaDeTeclas.length) {
    const instrumento = listaDeTeclas[contador].classList[1];
    const idAudio = `#som_${instrumento}`;
    listaDeTeclas[contador].onclick = function () {
        tocaSom(idAudio);
    };
    contador = contador + 1;
    
} */

for (contador = 0; contador < listaDeTeclas.length; contador++) {

	const tecla = listaDeTeclas[contador];
  const instrumento = tecla.classList[1];
  const idAudio = `#som_${instrumento}`;
  tecla.onclick = function () {
    tocaSom(idAudio);
  };

	tecla.onkeydown = function(evento) {
		if (evento.code === 'Space' || evento.code === 'Enter') {
			tecla.classList.add("ativa");
		}
	}

	tecla.onkeyup = function() {
		tecla.classList.remove("ativa");
	}

}
