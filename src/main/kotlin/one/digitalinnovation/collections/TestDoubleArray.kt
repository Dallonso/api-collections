package one.digitalinnovation.collections

fun main(){
    val wage = DoubleArray(3)
    wage[0] = 1000.0
    wage[1] = 3000.0
    wage[2] = 500.0

    wage.forEach{println(it)}

    //Usando o forEachIndex para acrescentar 10% de aumento para os salarios setados inicialmente
    println("----------------------------------")
    wage.forEachIndexed { index, wage1 ->
        wage[index] = wage1 * 1.10
    }
    wage.forEach{println(it)}

    //Usando o doubleOf para criar a lista sem determinar o limitante
    println("----------------------------------")
    val wage2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    wage2.sort()
    wage2.forEach{println(it)}
}