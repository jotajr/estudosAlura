package br.com.alura

public fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
    //val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin

    val assistiramAmbos: MutableSet<String> = mutableSetOf()

    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")

    println(assistiramAmbos)

    // infix sem ponto e sem () para parametro
    println(assistiramCursoAndroid union assistiramCursoKotlin)

    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    println(assistiramCursoAndroid intersect assistiramCursoKotlin)
}