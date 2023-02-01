package br.com.alura

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    // Com o companion object esta propriedade vira unica para todos as instancias deste objeto
    companion object {
        private val dados = mutableListOf<String>()
    }

}

fun testaColecao() {
    println("Projeto inicial de collections com Kotlin")

    val nomes: MutableList<String> = mutableListOf("Jota", "Patricia", "Enzo", "Lais")

    nomes.add("Evellyn")

    println(nomes.sorted())
}

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Jota Freitas Jr")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}