package com.jotajr.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: com.jotajr.bytebank.modelo.Funcionario){
        this.total += funcionario.bonificacao
    }

}