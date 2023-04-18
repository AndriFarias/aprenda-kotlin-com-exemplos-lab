enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val idade:Int)

data class ConteudoEducacional(val nome: String,val nivel:Nivel, val duracao: Int = 60)
fun conteudoEduca(): List<ConteudoEducacional>{
    return listOf(
    ConteudoEducacional("Aprendendo variaveis com Kotlin", Nivel.BASICO),
    ConteudoEducacional("Aprendendo funcões com Kotlin", Nivel.INTERMEDIARIO, duracao = 120)
    )
}   

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>){


    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        val aluno = usuario.nome.toString()
        println("O aluno $aluno foi matriculado com sucesso!")
    }
    fun listarInscritos():Unit{
        println(inscritos)
    }
}

fun main() {
    val aluno1 = Usuario("Lucia",20)
    val aluno2 = Usuario("Ana",25)
    val formacao1= Formacao("Kotlin",conteudoEduca())
    formacao1.matricular(aluno1)
    formacao1.matricular(aluno2)
    formacao1.listarInscritos()
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
}