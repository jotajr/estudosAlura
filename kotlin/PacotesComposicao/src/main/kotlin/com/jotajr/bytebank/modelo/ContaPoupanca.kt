package com.jotajr.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : com.jotajr.bytebank.modelo.Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}