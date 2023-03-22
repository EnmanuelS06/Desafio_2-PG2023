package com.example.ejercicio17

fun main(){
    var num1:Int
    var num2:Int

    println("Ingresa el primer numero")
    num1= readLine()!!.toInt()
    println("Ingresa el segundo numero")
    num2= readLine()!!.toInt()
    if(friends(num1,num2)){
        println("Los numeros son amigos")
    }else{
        println("Los numeros no son amigos")
    }
}

fun friends(num1:Int, num2:Int):Boolean{
    return  suma(num1)==num2 && suma(num2)==num1
}

fun suma(num:Int):Int{
    var suma=0
    for(i in 1 until num){
        if(num%i==0){
            suma+=i
        }
    }
    return suma
}
