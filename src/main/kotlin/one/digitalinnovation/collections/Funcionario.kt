package one.digitalinnovation.collections
// #1 - criar um data class de funcionário. Obs.: foi criada anteriormente em TestList
data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
        """.trimIndent()
}
