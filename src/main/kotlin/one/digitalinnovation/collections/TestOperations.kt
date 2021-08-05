package one.digitalinnovation.collections

fun main(){
    val wages = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(wage in wages){println(wage)}

    //Funções para verificar salario máximo, mínimo e média
    println("---------------------")
    println("Máximo salario: ${wages.maxOrNull()}")
    println("Menor salario: ${wages.minOrNull()}")
    println("Média salarial: ${wages.average()}")

    //Função para filtrar. Ex: maior que 2500.0
    println("---------------------")
    val wageFilter = wages.filter { it > 2500.0 }
    wageFilter.forEach { println(it) }
}