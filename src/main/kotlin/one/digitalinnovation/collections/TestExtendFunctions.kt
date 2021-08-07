package one.digitalinnovation.collections

fun main(){
    val wages = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println(wages.summation())
    println("-----------------")
    println(wages.media())
}