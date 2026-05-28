fun checkCharacter(ch: Char) {
    when (ch.lowercaseChar()) {
        'a', 'e', 'i', 'o', 'u' -> println("$ch is a Vowel")
        else -> println("$ch is a Consonant")
    }
}

fun main() {
    val character = 'E'
    checkCharacter(character)
}
