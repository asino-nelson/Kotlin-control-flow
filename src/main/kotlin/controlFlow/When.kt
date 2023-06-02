package controlFlow

fun main() {

    when(val alarm = 12){

        in 0..11 -> println("It is $alarm am")
        in 13..23 ->  println("It is $alarm pm ")
        else -> println("It is $alarm noon ")

    }

}