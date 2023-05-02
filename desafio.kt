enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, var idade: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
	val newUsuario: Usuario = Usuario("Giovanna", 20)
    val java:ConteudoEducacional = ConteudoEducacional("Java", 30, Nivel.BASICO)
    val kotlin:ConteudoEducacional = ConteudoEducacional("Kotlin", 45, Nivel.INTERMEDIARIO)
    val formaçao: Formacao = Formacao("DIO", listOf(kotlin, java))
    formaçao.matricular(newUsuario)
    
//     println(newUsuario)
//     println(java)
//     println(kotlin)
//     println(formaçao)

    println(formaçao.inscritos)
}