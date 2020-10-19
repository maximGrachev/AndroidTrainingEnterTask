println("Enter the first string")
val string1: String = readLine().toString()
println("Enter the second string")
val string2: String = readLine().toString()

fun checkPermutation(string1: String, string2: String): Boolean {
    return if (string1.length != string2.length) {
        false
    } else string1.toCharArray().sorted() == string2.toCharArray().sorted()
}

if (checkPermutation(string1, string2)) {
    println("These strings are result of permutation")
}
else {
    println("These strings aren't result of permutation")
}