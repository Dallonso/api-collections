package one.digitalinnovation.collections

fun main(){
    val names = Array<String>(3){""}
    names[0] = "Maria"
    names[1] = "Jose"
    names[2] = "João"

    for(name in names){
        println(name)
    }

    println("------------------------------")
    names.sort()
    names.forEach{println(it)}

    println("------------------------------")
    val names2 = arrayOf("Maria","José","João","Pedro")
    names2.sort()
    names2.forEach{println(it)}
}