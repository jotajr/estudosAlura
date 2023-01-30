package com.jotajr.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : com.jotajr.bytebank.modelo.Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}