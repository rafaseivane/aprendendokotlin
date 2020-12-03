fun main() {
    
     adicao(10, 20)
    subtracao(20,15)
    multiplicacao(10.0,6.0)
    divisao(8.0,2.0)
    
}
    
    fun adicao(a : Int, b : Int) {
        var adicao = a + b
        println(" Adição - $a + $b: " + adicao)
    }
    
    fun subtracao(a : Int, b : Int){
        var subtracao = a - b
        println(" Subtração - $a - $b: " + subtracao)

    }
    
    fun multiplicacao(a : Double, b: Double){
        var multiplicacao = a * b
        println(" Multiplicação - $a X $b: " + multiplicacao)
    }
    
    fun divisao(a : Double, b : Double){
        var divisao = a / b
        println(" Divisão - $a / $b: " + divisao)

    }