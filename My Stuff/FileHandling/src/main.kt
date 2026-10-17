import kotlin.io.path.Path
import kotlin.io.path.readText
import kotlin.io.path.readLines
import kotlin.io.path.appendText
import kotlin.io.path.writeText
import kotlin.io.path.writer

fun main() {
    
    var option = "0"
    val filePath = Path("names.txt")
    while (option != "q"){
        showOptions()
        print("Option: ")
        option = readln()
        val options = listOf("1", "2", "3", "4", "5", "q")
        /* Could I have used '1..4' notation?
         */
        if (option !in options)
        {
            println("Invalid Option")
            continue
        }
        if (option == "1")
        {
            optionOne(filePath)
        }

        if (option == "2")
        {
            print("Index: ")
            val names = filePath.readLines()
            var index = readln().toInt()
            if (index !in 1..names.size)
            {
                println("Index out of range")
                println()
                continue
            }
            var name = names[index-1]
            print("Name: $name\n") 
        }
        
        if (option == "3")
        {
            print("Name to Add: ")
            var name = readln()
            filePath.appendText("$name\n")
            println()
        }

        if (option == "4")
        {
            var names = mutableListOf<String>()
            print("Add Multiple Names. Press 'q' to End\n")
            var name = ""
            while (true)
            {
                print("Name: ")
                name = readln()
                if (name == "q")
                {
                    break
                }
                names.add(name)
            }

            filePath.writer().use {
                for (name in names)
                {
                    it.write("$name\n")
                }
            }
        }
        

        if (option == "5")
        {
            filePath.writeText("")
        } 


    }
    
}

fun showOptions() = println("Choose an Option\n  (1) View All Names \n  (2) View a Particular Name \n  (3) Add a Name \n  (4) Add Multiple Names \n  (5) Reset List \n  (q) Quit\n")


fun optionOne(filePath: java.nio.file.Path)
{
    val names = filePath.readText()
    println(names)
}