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

    //Função Count: Função conta numero de ites. No exemplo foi especificado um range para tal
    println("---------------------")
    println(wages.count{it in 2000.0..5000.0})

    //Função Find: Função  busca itens. No exemplo foi especificado um item para ser verificado
    println("---------------------")
    println(wages.find{it == 2250.0})
    println(wages.find{it == 500.0})

    //Função Any: Função busca itens e retorna ture ou false. No exemplo foi especificado um item para ser verificado
    println("---------------------")
    println(wages.any{it == 1000.0})
    println(wages.any{it == 500.0})
}