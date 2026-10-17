// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if(args.size != 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    var a = args[0].toFloat()
    var b = args[1].toFloat()
    var c = args[2].toFloat()

    val s = 0.5 * (a + b + c)
    var area = sqrt(s*(s - a) * (s - b) * (s - c))

    System.out.printf("Area = %.5f\n", area)   
}