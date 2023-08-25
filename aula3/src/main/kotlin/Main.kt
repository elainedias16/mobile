data class Pessoa constructor(var nome: String, var idade: Int) {
    var cpf: String? = null
        get(){
            println("- Acessando get")
            return field?.substring(3, 8) // field faz referência ao atributo
        }
        set(valor){
            println("- Acessando set")
            if (valor?.length == 11)
                field = valor
            else
                field = null
        }
    constructor(nome: String, idade: Int, cpf:String): this(nome, idade) {
        this.cpf = cpf
    }


}


enum class Notas{
    A, B, C, D, E, F
}


fun main(args: Array<String>) {
    val p1 = Pessoa("Andre", 31)
    val p2 = Pessoa("Andre", 31)

    println("- São iguais: ${p1.equals(p2)}")
    println("- String: ${p1.toString()}")
    println("- HashCode p1: ${p1.hashCode()}")
    println("- HashCode p2: ${p2.hashCode()}")
}