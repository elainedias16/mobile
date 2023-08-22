package main

class Song constructor(var title: String, var artist: String , var release_year: Int, var playbackcount : Int , var famous : Int){
    fun musicDescription(){
        println("${this.title}, de ${artist}, lançado em ${release_year}")
    }
}


fun main() {

    val music = Song("22", "taylor", 2015, 1500, 2000)
    music.musicDescription()


    // Declara uma lista de inteiros
    val lst1: List<Int>
//    lst1 = [1 , 2]
//    println(lst1)

    // Cria uma lista de Float vazia
    val lst2 = listOf<Float>()

//    // Cria uma lista inferindo o tipo a partir dos dados
    val lst3 = listOf(1, 2, 3, 4)
    println(lst3)

//
//    // Declara e instancia a lista
//    val lst4: List<Any> = listOf(1, 2f, ‘3’, “Mobile”)

    val lst4: MutableList<Int> = mutableListOf(1, 2, 3, 4)
    println(lst4)
    lst4.add(20)
    println("new list")
    println(lst4)
    lst4.remove(1)
    println(lst4)

    //to no slide 8
    //exception happens in execution time

    val s : String = "elaine"
    println(s)



    //Imagine que você precise criar um app de reprodução de música.
    //
    //Crie uma classe que represente a estrutura de uma música. A classe Song precisa incluir estes elementos de código:
    //
    //    Propriedades do título, artista, ano de lançamento e contagem de reprodução.
    //    Uma propriedade que indica se a música é famosa. Se o número for menor que 1.000, considere que não gostam muito dela.
    //    Um método que mostra uma descrição de música neste formato:
    //
    //"[Título], de [artista], lançado em [ano de lançamento]."



    //

}
