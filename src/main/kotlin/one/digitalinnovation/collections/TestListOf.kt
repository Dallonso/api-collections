package one.digitalinnovation.collections

fun main(){
    val joao = employee("João", 2000.0,"CLT")
    val pedro = employee("Pedro", 1500.0, "PJ")
    val maria = employee("Maria", 4000.0,"CLT")

    val employees = listOf(joao, pedro, maria)

    employees.forEach { println(it) }

    println("--------------------")
    println(employees.find{(it.name == "Maria")})

    println("--------------------")
    employees
        .sortedBy { it.wage}
        .forEach{println(it)}

    println("--------------------")
    employees
        .groupBy { it.recrutType}
        .forEach{println(it)}
}