package br.com.alura.bytebank

fun main() {

    //val minhaFuncao: () -> Unit = ::teste
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
    val minhaFuncaoClasse: () -> Unit = Teste()
    minhaFuncaoClasse()

}

fun teste() {
    println("executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke do teste")
    }

}
