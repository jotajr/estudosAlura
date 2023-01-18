class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if(admin.autentica(senha)) {
            println("Usuario ${admin.nome} Autenticado. Bem vindo")
        } else {
            println("Falha na autenticacao")
        }
    }
}