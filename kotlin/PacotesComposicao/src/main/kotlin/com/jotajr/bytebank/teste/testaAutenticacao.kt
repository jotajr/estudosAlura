package com.jotajr.bytebank.teste

import com.jotajr.bytebank.modelo.Cliente
import com.jotajr.bytebank.modelo.Diretor
import com.jotajr.bytebank.modelo.Gerente
import com.jotajr.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = com.jotajr.bytebank.modelo.Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretora = com.jotajr.bytebank.modelo.Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )
    val cliente = com.jotajr.bytebank.modelo.Cliente(
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val sistema = com.jotajr.bytebank.modelo.SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 1234)
}