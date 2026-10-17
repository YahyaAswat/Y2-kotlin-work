// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>)
{
    if (args.size!=2)
    {
        println("2 Arguments required")
        exitProcess(1)
    }
    val a = args[0]
    val b = args[1]
    var sorted_a = anagrams(a, b) 
    print("$a and $b are Anagrams: $sorted_a\n")
}