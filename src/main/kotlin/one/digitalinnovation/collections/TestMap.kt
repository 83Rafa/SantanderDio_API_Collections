package one.digitalinnovation.collections
// mapa: coleção de chaves e seus valores
fun main() {
    // pair (Chave, Valor)
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    // iteração
    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    println(" ")
    // mapOf (Chave to Valor)
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )
    // iteração
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}