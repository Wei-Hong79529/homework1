package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner=Scanner(System.`in`)
    print("please enter number of ticketes")
    var ticket=scanner.nextDouble()
    print("please enter number of ticketes")
    var roundtrip=scanner.nextDouble()
    val train=Trainticket(ticket,roundtrip);
    train.count()
}
class Trainticket(var ticket:Double, var roundtrip:Double){

fun count(){
    var total:Double
    total=(ticket-roundtrip)*1000+(roundtrip*2000*0.9)
    println("Total ticketes"+ticket)
    println("Round-trip"+roundtrip)
    println("Total price  "+total)


}
}
