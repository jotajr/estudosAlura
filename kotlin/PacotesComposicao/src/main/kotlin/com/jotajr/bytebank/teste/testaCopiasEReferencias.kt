package com.jotajr.bytebank.teste

import com.jotajr.bytebank.modelo.Cliente
import com.jotajr.bytebank.modelo.ContaCorrente
import com.jotajr.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente("Joao", "87374823", 24);
    val contaJoao = ContaCorrente(joao, 1002)
    val maria = Cliente("Maria", "67325232", 123);
    var contaMaria = com.jotajr.bytebank.modelo.ContaPoupanca(maria, 1003)

    println("titular conta joao: ${contaJoao.titular.nome}")
    println("titular conta maria: ${contaMaria.titular.nome}")

    println(contaJoao)
    println(contaMaria)
}