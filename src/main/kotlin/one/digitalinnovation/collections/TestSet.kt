package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    //#7 - unir duas listas de funcionários utilizando .union
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println(" ")
    //#8 - retirar itens de uma lista (funcionarios2) com subtract
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println(" ")
    //#9 - retornar o que há em comum  entre duas listas com intersect
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}