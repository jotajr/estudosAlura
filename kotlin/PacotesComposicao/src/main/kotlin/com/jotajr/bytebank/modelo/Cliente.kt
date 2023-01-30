package com.jotajr.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int
) : com.jotajr.bytebank.modelo.Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}