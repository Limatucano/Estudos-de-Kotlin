import java.lang.NumberFormatException
import java.util.*

var nomes = mutableListOf<String>()

fun cadastrar(nome: String?) {
    try{
        if (nome != null) {
            if(nome !in nomes){
                nomes.add(nome)
            }else{
                println("O funcionario ja foi cadastrado")
            }

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

fun Buscar(nome: String?){
    try{
        if(nome in nomes){
            println("O funcionario já foi cadastrado")
        }
        else{
            println("$nome não foi cadastrado")
            println("deseja cadastrar? SIM ou NAO")
            var op = readLine()
            if (op != null) {
                if (op.toUpperCase()=="SIM"){
                    cadastrar(nome)
                }
            }
        }
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
        println("4- Buscar funcionario")
        println("Digite qualquer outra opção para SAIR")
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
            "4"->{
                println("digite o nome do funcionario que deseja verificar:")
                var nome = readLine()
                Buscar(nome)
            }
            else->{
                break
            }

        }

    }


}


