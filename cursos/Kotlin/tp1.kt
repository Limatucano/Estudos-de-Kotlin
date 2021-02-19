/*1. Qual a diferença entre uma variável declarada com var e uma declarada com val ?
R:val é considerado uma variável imutável com isso é impossibilitado mudar seu valor
 após ser setado, o contrário da var onde pode ser alterado ao decorrer do
 processamento do sistema */

//Listas de teste:
val triangulo = listOf(1,2,3,4,5,4,3,2,1,0)
val fibonacci = listOf(1,1,2,3,5,8,13,21,34)
val vazio     = listOf<Int>()

/*2.Faça um programa que exiba "Infnet", caso o primeiro elemento de uma lista seja
menor que o último, e "Tenfni", caso contrário.
 */
fun main(args: Array<String>) {
    val lista =  triangulo

    if(lista.isNullOrEmpty()){
        println("Tenfni")
    }else{
        if(lista[lista.size - 1] > lista[0]) println("Infnet") else println("Tenfni")
    }

}

