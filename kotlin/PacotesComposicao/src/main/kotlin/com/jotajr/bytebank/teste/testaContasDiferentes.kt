package com.jotajr.bytebank.teste

import com.jotajr.bytebank.modelo.Cliente
import com.jotajr.bytebank.modelo.ContaCorrente
import com.jotajr.bytebank.modelo.ContaPoupanca
import com.jotajr.bytebank.modelo.Endereco

fun testaContasDiferentes() {

    val alex = Cliente("Alex", "87374823", 23, Endereco(logradouro = "Rua Dr Fco Lima Neto, 129"));
    val fran = Cliente("Fran", "8643544343", 32);

    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 1001
    )

    println("O endereco do rapaz eh ${contaCorrente.titular.endereco.logradouro}")

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}