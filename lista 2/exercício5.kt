fun main() {

    var altura = 1.60
    var peso = 62.0
    var imc = peso / (altura * altura)

    if(imc <= 18.5){
        println("Seu IMC é : $imc e está abaixo do peso !")
    }
    else if(imc >= 18.6 && imc <= 24.9 ){
        println("Seu IMC é : $imc e está no peso ideal !")
    }
    else if(imc >= 25.0 && imc <= 29.9){
        println("Seu IMC é : $imc e está em sobrepeso !")
    }
    else if(imc >= 30.0 && imc <= 39.9){
        println("Seu IMC é : $imc e está em obesidade  !")
    }
    else if(imc >= 40.0){
        println("Seu IMC é : $imc e está em obesidade grave !")
    }
    

}