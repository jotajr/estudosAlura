package com.jotajr.bytebank.modelo

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : com.jotajr.bytebank.modelo.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), com.jotajr.bytebank.modelo.Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}