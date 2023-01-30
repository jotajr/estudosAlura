package com.jotajr.bytebank.modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : com.jotajr.bytebank.modelo.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }

}