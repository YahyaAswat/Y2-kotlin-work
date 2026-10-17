// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(input_str: String, to_remove: String, redact_char: Char = 'X'): String
{
    if (to_remove.isEmpty()) {return input_str}
    var output_str = StringBuilder(input_str)

    var index = output_str.indexOf(to_remove)
    val size = to_remove.length

    while (index != -1)
    {
        println("Another one")
        for (i in index..<index+size )
        {
            output_str[i] = redact_char
        }

        index = output_str.indexOf(to_remove)
    }

    return output_str.toString()
}