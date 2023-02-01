package br.com.alura

fun main() {

    val banco = BancoDeNomes()
    banco.salva("Jota Freitas Jr")
    println(banco.nomes)
    println(BancoDeNomes().nomes)

}

class BancoDeNomes {

    val nomes: Collection<String> get() = Companion.dados

    fun salva(nome: String) {
        Companion.dados.add(nome)
    }

    // Com o companion object esta propriedade vira unica para todos as instancias deste objeto
    companion object {
        private val dados = mutableListOf<String>()
    }
}

private fun testaColecao() {
    println("Projeto inicial de collections com Kotlin")

    val nomes: MutableList<String> = mutableListOf("Jota", "Patricia", "Enzo", "Lais")

    nomes.add("Evellyn")

    println(nomes.sorted())
}