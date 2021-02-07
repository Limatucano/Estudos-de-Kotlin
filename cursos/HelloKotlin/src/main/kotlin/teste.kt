import java.lang.NumberFormatException
import java.util.*

var nomes = mutableListOf<String>()

fun cadastrar(nome: String?) {
    try{
        if (nome != null) {
                nomes.add(nome)
            }
    }catch(e:Exception){
        println(e)
    }
}
fun listar(){
    return nomes.forEach(){
        println(it)
    }
}

fun  Excluir(nome: String?){
    try{
        nomes.remove(nome)
    }catch (e:Exception){
        println(e)
    }
}
fun main(args: Array<String>){

    while(true){
        println("Menu de cadastro de funcionarios")
        println("1- Cadastrar funcionario")
        println("2- Listar todos funcionarios")
        println("3- Remover funcionario")
        println("Digite qualquer opção para SAIR")
        println("Selecione uma opção")
        var op = readLine()
        when(op){
            "1"->{
                println("digite o nome do funcionario:")
                var nome = readLine()
                cadastrar(nome)
            }
            "2"->{
                listar()
            }
            "3"->{
                println("digite o nome do funcionario que deseja remover:")
                var nome = readLine()
                Excluir(nome)
            }
            else->{
                break
            }

        }

    }


}


