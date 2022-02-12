import kotlin.reflect.typeOf

class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{
        //TODO return the colours list
        return colours
    }

    fun numberOfColours (): Int{
        //TODO return the size of the colours list
        return colours.size
    }

    fun firstColour() : String{
        //TODO return the first colour in the list
        return colours[0]
    }

    fun lastColour() : String{
        //TODO return the last colour list
        return colours[colours.size-1]
    }

    fun coloursInAplhabeticOrder() : List<String>{
        //TODO return the colours in alphabetical order
        return colours.sorted()
    }

    fun coloursInAllCapitals() : List<String>{
        //TODO return the colours in ALL CAPS
        return colours.map { it.uppercase() }
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        //TODO return the colours starting with the letter passed as a parameter
        return colours.filter { it.startsWith(letter) }
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String> {
        //TODO return the colours that have exactly the same number of chars as the number passed as a parameter
        return colours.filter { it.length == size }
        // Got help from this webpage:
        // https://kotlinlang.org/docs/collection-filtering.html
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //TODO return the colours that have less chars than the number passed as s parameter
        return colours.filter {it.length < size}
    }

    fun isColourInTheList(colour : String) : Boolean{
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        return colour.uppercase() in colours.map { it.uppercase() }
        // This will return a Boolean. If the colour passed is in the list of colours, it will return true or false.
    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.
    fun coloursInReversedAlphabeticOrder(): List<String>{
        return colours.sortedDescending()
    }

    fun coloursEndingWithLetter(letter: Char) : List<String>{
        return colours.filter { it.uppercase().endsWith(letter.uppercase()) }
    }

    //This function returns the colour that is in the middle of the list of colours.
    //I used the modulus operator to make sure if there was an item in the middle of the list,
    //else if the list had an EVEN number of items, it will not return any item.
    fun colourInTheMiddleOfList() : String {
        val sizeOfList = colours.size/2
        val colour = colours.get(sizeOfList);

        if (sizeOfList%2 == 0 )
            return colour

        else
            return ("Sorry, the list has an EVEN number of items.")
    }
}