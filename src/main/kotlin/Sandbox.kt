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
    val intQualquer: Int = 1000
    var doubleQualquer: Double = 2.00
    // erro => val doubleErrado: Double = "yes"
    doubleQualquer += 3
    println(doubleQualquer)
}