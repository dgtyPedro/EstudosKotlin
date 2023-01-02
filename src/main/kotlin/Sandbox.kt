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

    val minhaClasse = Classe("texto1")
    minhaClasse.nome = "pedro"
    minhaClasse.saldo = 100

//   erro por conta do construtor => val outraClasse = Classe()

    val outraClasse = Classe("texto2")
    outraClasse.nome = "maria"
    outraClasse.saldo = 50

    // erro -> println(outraClasse.secret)

    println("------")
    println("${minhaClasse.nome}")
    println(outraClasse.nome)
    outraClasse.mostrarNome()
    if (minhaClasse.transferirSaldo(30, outraClasse)) {
        println("Transferência finalizada")
    } else {
        println("Não foi possível realizar a transferência")
    }

    println(minhaClasse.getSecret())
    outraClasse.setSecret("segredo")
}

fun iteracoes() {
    for (i in 1..8) {
        println(i)
    }
    println("-----")
    for (i in 5 downTo 1) {
        println(i)
    }
    println("-----")
    for (i in 10 downTo 0 step 2) {
        if (i == 4) continue
        if (i == 0) break
        println(i)
    }

    println("-----")

    var x = 0
    while (x < 4) {
        println(x)
        x++
    }
}

fun testeCondicoes(valor: Int) {
    if (valor > 4) {
        println("$valor é maior que 4")
    } else if (valor > 3) {
        println("$valor é maior que 3")
    } else {
        println("$valor é menor que 3")
    }

    when {
        valor % 2 == 0 -> {
            println("$valor é par")
        }

        else -> {
            println("$valor é impar")
        }
    }
}

//forma primaria, sem firula => class Classe(var obrigatorio: String){
class Classe {
    var nome = ""
    var saldo = 0;
    private var secret = "senha perigosa"
    var obrigatorio: String = ""
    constructor(obrigatorio: String){
        this.obrigatorio = obrigatorio
    }
    //private não pode ser lida fora da classe

    fun mostrarNome() {
        println("${nome}")
    }

    fun transferirSaldo(valor: Int, destino: Classe): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            println(saldo)
            println(destino.saldo)
            return true
        }
        return false
    }

    fun getSecret(): String{
        return secret
    }
    fun setSecret(valor: String): Boolean{
        secret = valor
        return true
    }

    //Mesma coisa set get
//    var secretProp = 0.0
//        private set(valor){
//            field = valor
//        }
//        get(){return field}
}