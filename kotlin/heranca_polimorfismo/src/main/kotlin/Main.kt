fun main() {
    println("Bem vindo ao Bytebank")

    var gerente = Gerente(nome = "Jota Jr", cpf = "89328048230", salario = 23000.0, senha = 1000)
    var diretor = Diretor(nome = "Angelo", cpf = "89347832478", salario = 45000.0, senha = 1001, plr = 50000.0)

    val sistema = SistemaInterno()

    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 2121)
}