package com.jotajr.bytebank.teste

import com.jotajr.bytebank.modelo.Analista
import com.jotajr.bytebank.modelo.CalculadoraBonificacao
import com.jotajr.bytebank.modelo.Diretor
import com.jotajr.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val alex = com.jotajr.bytebank.modelo.Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao}")

    val fran = com.jotajr.bytebank.modelo.Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val gui = com.jotajr.bytebank.modelo.Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")

    if (gui.autentica(4000)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val maria = com.jotajr.bytebank.modelo.Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    val calculadora = com.jotajr.bytebank.modelo.CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificação: ${calculadora.total}")
}