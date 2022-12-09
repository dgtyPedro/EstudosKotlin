fun main() {
    // Variaveis e Retorno

    println("Hello World!")
    val nome = "Pedro"
    println("Meu nome é $nome")
    // erro => nome = "Gabriel"
    var estado = "enrolado"
    print("Meu nome sempre vai ser $nome mas meu estado ($estado) pode mudar")
    estado = "namorando"
    println("estado: $estado")
    val inteiro = 2
    val decimal = 3.84
    println(inteiro)
    println(decimal)

    // Tipagem

    val strQualquer: String = "Lorem"
    val intQualquer: Int = 4
    var doubleQualquer: Double = 2.00
    // erro => val doubleErrado: Double = "yes"
    doubleQualquer += 3
    println(doubleQualquer)

    testeCondicoes(intQualquer)
    iteracoes()
}

fun iteracoes(){
    for(i in 1..8){
        println(i)
    }
    println("-----")
    for(i in 5 downTo 1){
        println(i)
    }
    println("-----")
    for(i in 10 downTo 0 step 2){
        if(i == 4) continue
        if(i == 0) break
        println(i)
    }

    println("-----")

    var x = 0
    while(x < 4){
        println(x)
        x++
    }
}

fun testeCondicoes(valor: Int){
    if(valor > 4){
        println("$valor é maior que 4")
    }else if(valor > 3){
        println("$valor é maior que 3")
    }else{
        println("$valor é menor que 3")
    }

    when{
        valor % 2 == 0 -> {
            println("$valor é par")
        }else -> {
            println("$valor é impar")
        }
    }
}