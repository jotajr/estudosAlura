package com.jotajr.bytebank.modelo

class SistemaInterno {

    fun entra(admin: com.jotajr.bytebank.modelo.Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }

}