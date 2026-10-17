// Task 5.1.1: anagrams() function

fun anagrams(a: String, b: String) : Boolean
{
    return a.lowercase().toList().sorted() == b.lowercase().toList().sorted()
}