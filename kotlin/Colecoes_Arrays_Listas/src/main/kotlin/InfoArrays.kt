
fun main() {
    println("Iniciando testes com Array")

    val idades: IntArray = intArrayOf(25,19,33,20,55)

    /*val idades = IntArray(4)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20*/

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if(idade > maiorIdade) maiorIdade = idade
    }

    println("A maior idade encontrada foi $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if(idade < menorIdade) menorIdade = idade
    }

    println("A menor idade encontrada foi $menorIdade")

}