fun main() {
    println("Bem vindo ao Bytebank")
    /*val titular: String = "Jota Freitas Jr"
    val numeroConta: Int = 1000
    var saldo: Double = 0.00
    saldo = 100 + 2.0
    saldo += 200

    println("Titular: $titular")
    println("Numero da conta: $numeroConta")
    println("Saldo: R$ $saldo")*/

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    //testaCondicoes(saldo)

    /*for (i in 1..5) {
        println(i)
    }*/

    /*for (i in 5 downTo 1 step 2) {
        println(i)
    }*/

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaCondicoes(saldo: Double) {

    //if (saldo > 0.0) println("O Saldo da conta é positivo") else if (saldo == 0.0) println("O saldo da conta é neutro") else println("O saldo da conta é negativo")

    when {
        saldo > 0.0 -> println("O Saldo da conta é positivo")
        saldo == 0.0 -> println("O saldo da conta é neutro")
        else -> println("O saldo da conta é negativo")
    }
}