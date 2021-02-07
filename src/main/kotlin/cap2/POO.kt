open class Carro{
    var cor:String? = ""
    var modelo:String? = ""


    fun pintarCarro(newcor:String):String{
        this.cor = newcor
        return "${this.cor} é a nova cor do carro"
    }
    fun comprou():String{
        return "parabens pela compra"
    }
}
class Sedan:Carro(){
    var tracao = true

    fun tracaorodas(qtd:Int):String{
        if(tracao == true.and(qtd in 0..4)){
            return "$qtd rodas com tração"
        }else{
            return "modo tração desabilitado"
        }
    }
}
fun main(args: Array<String>){
    val civic = Sedan()
    civic.cor = "Preto"
    civic.tracao = true

    println(civic.tracaorodas(5))
    val corsa = Carro()
    corsa.cor = "Azul"
    corsa.modelo = "hatch"

    println(corsa.pintarCarro("Vermelho"))
    println(corsa.comprou())
}