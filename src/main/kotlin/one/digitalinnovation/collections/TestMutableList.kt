package one.digitalinnovation.collections

fun main(){
    val joao = employee("João", 2000.0,"CLT")
    val pedro = employee("Pedro", 1500.0, "PJ")
    val maria = employee("Maria", 4000.0,"CLT")

    val employees = mutableListOf(joao, maria)
    employees.forEach{println(it)}

    println("---------------")
    employees.add(pedro)
    employees.forEach{println(it)}

    println("---------------")
    employees.remove(joao)
    employees.forEach{println(it)}

    println("------SET------")
    val employeeSet = mutableSetOf(pedro)
    employeeSet.forEach{println(it)}

    println("---------------")
    employeeSet.add(joao)
    employeeSet.add(maria)
    employeeSet.forEach{println(it)}

    println("---------------")
    employeeSet.remove(maria)
    employeeSet.forEach{println(it)}

}