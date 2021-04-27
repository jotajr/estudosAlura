import React, { Component } from 'react'

class FormularioCadastro extends Component {
    render(){
        return (
          <form action="">
            <input placeholder="Título" />
            <textarea placeholder="Escreva sua nota..."></textarea>
            <button>Criar Nota</button>
          </form>
        );
    }
}

export default FormularioCadastro