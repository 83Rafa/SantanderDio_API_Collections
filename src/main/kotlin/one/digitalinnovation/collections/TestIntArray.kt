package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for(valor in values) {
        println(    valor)
    }

    println(' ')
    values.forEach { //usa um recurso de lambda do kotlin "it"
        println(it)
    }

    println(' ')
    values.forEach { valor -> //troca o it por "valor"
        println(valor)
    }

    println(' ')
    for (index in values.indices) { //itera sobre os índices do array
        println(values[index])
    }

    println(' ')
    values.sort()
    for (valor in values) { //.sort para ordenação
        println(valor)
    }
}