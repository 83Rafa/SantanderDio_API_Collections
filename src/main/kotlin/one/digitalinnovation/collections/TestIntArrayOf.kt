package one.digitalinnovation.collections

fun main() {     //inicialização sem a necessidade de definir o tamanho do array
    val values = intArrayOf(2, 3, 4, 1, 10, 7) // array inicializado com valores e referência "values"

    values.forEach {
        println(it)
    }

    println(" ")
    values.sort()
    values.forEach {
        println(it)
    }
}