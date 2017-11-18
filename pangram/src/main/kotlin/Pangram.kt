class Pangram {

    companion object {
        fun isPangram(text: String): Boolean = text.toLowerCase().toSet().containsAll(('a'..'z').toSet())
    }

}