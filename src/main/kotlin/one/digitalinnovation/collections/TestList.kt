package one.digitalinnovation.collections
// #2 - instanciar 3 objetos funcionário com nome e salário
fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    // #3 - atribuir a uma lista e iterar lista
    val funcionarios = listOf(joao, pedro, maria)

    // #4 - fazer busca de um funcionário utilizando .find
    funcionarios.forEach { println(it) } //o it representa um funcionário

    println(" ")
    println(funcionarios.find { it.nome == "Maria" })

    println(" ")
    // #5 - fazer um sortedBy salário
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println(" ")
    // #6 - agrupar funcionários por tipo
    funcionarios
        .groupBy {  it.tipoContratacao }
        .forEach { println(it) }
}


