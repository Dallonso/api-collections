package one.digitalinnovation.collections

fun main() {
    val joao = employee("João", 2000.0, "CLT")
    val pedro = employee("Pedro", 1500.0, "PJ")
    val maria = employee("Maria", 4000.0, "CLT")

    val employee1 = setOf(joao, pedro)
    val employee2 = setOf(maria)

    val resultUnion = employee1.union(employee2)
    resultUnion.forEach{println(it)}

    println("-----------------------")
    val employee3 = setOf(joao, pedro, maria)
    val resultSubtract = employee3.subtract(employee2)
    resultSubtract.forEach{println(it)}

    println("-----------------------")
    val resultIntersect = employee3.intersect(employee2)
    resultIntersect.forEach{println(it)}
}