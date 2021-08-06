package one.digitalinnovation.collections

data class employee(
    val name: String,
    val wage: Double,
    val recrutType: String
){
    override fun toString(): String =
        """
        Nome:       $name
        Salário:    $wage
    """.trimIndent()
}
