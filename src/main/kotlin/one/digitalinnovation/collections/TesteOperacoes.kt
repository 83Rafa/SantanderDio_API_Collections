package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println(" ")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    println(" ")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach { print(it) }

    println(" ")
    //range
    println(salarios.count { it in 2000.0..5000.0 })

    println(" ")
    //buscando valor específico
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println(" ")
    //qualquer onde a expressão seja válida
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 100.0 })
}