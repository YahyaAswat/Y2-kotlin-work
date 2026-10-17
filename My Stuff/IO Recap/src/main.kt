import kotlin.system.exitProcess

const val XP_MULTIPLIER = 10

fun main(args: Array<String>)
{

    if (args.size != 3)
    {
        println("Usage: kotlin run {Player_Name} {Player_Level} {Player_Status}")
        exitProcess(1)
    }

    val name = args[0]
    val level = args[1].toInt()
    val status = args[2]

    if (status.uppercase() != "ACTIVE" && status.uppercase() != "OFFLINE")
    {
        println("Player Status should be either 'Active' or 'Offline'")
        exitProcess(2)
    }

    if (status.uppercase() == "OFFLINE")
    {
        println("We hope to see you soon adventurer")
        exitProcess(0)
    }
    
    var bonus = XP_MULTIPLIER*level
    
    print("Base XP: ")
    var xp = readln().toInt()
    xp +=bonus
    
    


    println("Welcome $name")
    println("-----------------------------")
    println("Level: $level")
    println("Status: $status")
    println("Total XP: ${xp}")



    
    

}