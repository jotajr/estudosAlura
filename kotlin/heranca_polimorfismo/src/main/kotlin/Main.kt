fun main() {
    println("Bem vindo ao Bytebank")
    val jota = Funcionario(nome = "Jota", cpf = "008901", salario = 200.0)
    println("nome: ${jota.nome}")
    println("cpf: ${jota.cpf}")
    println("salario: ${jota.salario}")
    println("bonificacao: ${jota.bonificacao()}")

    val fran = Gerente(nome = "Fran", cpf = "090909", salario = 1500.0, senha = 1234)

    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")
    println("bonificacao: ${fran.bonificacao()}")

    val sergio = Diretor(nome = "Sergio", cpf = "080808", salario = 5500.0, senha = 1234, plr = 50000.0)

    println("nome: ${sergio.nome}")
    println("cpf: ${sergio.cpf}")
    println("salario: ${sergio.salario}")
    println("bonificacao: ${sergio.bonificacao()}")
    println("PLR: ${sergio.plr}")


}