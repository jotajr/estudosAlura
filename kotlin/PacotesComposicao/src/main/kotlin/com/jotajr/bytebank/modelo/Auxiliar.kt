package com.jotajr.bytebank.modelo

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : com.jotajr.bytebank.modelo.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() = salario * 0.05 //To change initializer of created properties use File | Settings | File Templates.


}