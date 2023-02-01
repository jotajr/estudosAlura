package br.com.alura

public fun testaMap() {
    val pedidos = mutableMapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println(pedidos)

    //null safety
    val pedido = pedidos[2]
    pedido?.let {
        println("pedido: $it")
    }

    for (p in pedidos) {
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: R$ ${p.value}")
    }

    pedidos[4] = 70.0
    pedidos.put(5, 56.8)
    pedidos[1] = 100.0
    pedidos.putIfAbsent(6, 65.0)
    pedidos.putIfAbsent(6, 105.0)

    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
}