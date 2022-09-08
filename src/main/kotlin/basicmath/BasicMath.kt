package basicmath

import java.lang.Integer.min
import java.lang.Math.pow
import kotlin.math.pow

class BasicMath {

    fun countDigit(){
        var digit = 12345
        var count = 0
        while (digit != 0){
            digit /= 10
            count++
        }
        println(count)
    }

    fun reverseDigit(){
        var values = 12345
        var count = 0
        var digit: Int
        while (values !=0){
            digit = values%10
            count= count*10 + digit
            values/=10
        }
        println(count)
    }

    fun checkPalindrome(){
        var values = 121
        var count = 0
        var digit : Int
        var palindromeNumber = 0
        while (values!=0){
            digit = values%10
            count = count*10 + digit
            values/=10
            palindromeNumber = values
        }
        if(values == palindromeNumber){
            println(true)
        }
        else{
            println(false)
        }
    }

    fun checkGCD(){
        var first = 4
        var second = 8
        var output = 0
        for(i in 1..min(first,second)){
            if(first % i== 0 && second % i==0){
                output = i
            }
        }
        println(output)
    }

    fun checkArmstrong(){
        var originalNumber = 153
        var number = 153
        var temp = number
        var power = 0.0
        var armStrongNumber = 0.0
        while (temp!=0){
            power++
            temp/=10
        }
        while (number!=0){
            val digit = number%10
            armStrongNumber+= pow(digit.toDouble(),power)
            number/=10
        }
        if(originalNumber.toDouble()==armStrongNumber){
            println(true)
        }else{
            println(false)
        }
    }

    fun printAllDivisior(){
        val number = 36
        for (i in 1..number){
            if(number % i == 0){
                print("$i ")
            }
        }
    }
}