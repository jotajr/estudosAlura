package br.com.alura.bytebank

import java.lang.NumberFormatException

fun main() {
    println("início main")

    val entrada: String = "10"

    /*try {
        val valor: Double = entrada.toDouble()
        println("valor de entrada $valor")
    } catch (e: NumberFormatException) {
        println("Problema na conversao do numero")
        e.printStackTrace()
    }*/

    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Falha na conversao do numero")
        e.printStackTrace()
        null
    }

    /*if(valor != null) {
        println("Valor recebido $valor")
    } else {
        println("O valor da variavel eh nulo")
    }*/

    val valorComTaxa: Double? = if (valor != null) {
        valor + (valor * 0.1)
    } else {
        0.0
    }

    println("O valor com taxa eh de R$ $valorComTaxa")



    //funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
    }
    println("fim funcao2")
}