package cap2

data class Usuario(var nome:String, var email:String, var senha:String)

fun main(args:Array<String>){
    var matheus = Usuario("matheus","matheus@gmail.com","123")

    println(matheus.email)
    println(matheus.nome)
    println(matheus.senha)
}ssh-ed25519