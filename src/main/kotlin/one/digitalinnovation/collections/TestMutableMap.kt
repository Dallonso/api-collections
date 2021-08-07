package one.digitalinnovation.collections

fun main(){
    val joao = employee("João", 2000.0,"CLT")
    val pedro = employee("Pedro", 1500.0, "PJ")
    val maria = employee("Maria", 4000.0,"CLT")

    val reposit = repository<employee>()

    reposit.create(joao.name, joao)
    reposit.create(pedro.name, pedro)
    reposit.create(maria.name, maria)

    println(reposit.findById(maria.name))

    println("----------------------")
    reposit.findAll().forEach { println(it) }

    println("----------------------")
    reposit.remove(maria.name)
    reposit.findAll().forEach { println(it) }
}