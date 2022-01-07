import java.io.File
/**
 *
 * readFile чтение файла.
 * outputName имя переписанного файла с текстом из файла  inputName.
 * quantityWord - считает количестослов в файле
 */
class Sort(){

    fun readFile(inputName: String): String = File(inputName).readText().lowercase()

    fun writeFile(text: String, outputName: String){
        val f = File(outputName)
            if (!f.exists()) {
                f.createNewFile()
            } 
        f.writeText(text)
    }//writeFile
    
    /**
    * trim() - Удалит пробел в конце файла
    * Функция считает количество пробелов
    */
    fun quantityWord(text: String): Int = Regex("""(\s+|(\r\n|\r|\n))""").findAll(text.trim()).count() + 1

    // считаем количесва знаков
    fun occurrencesOfCharacters(text: String): Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()
        for (c in text) {
            // Игнорируем пробелы.
            if(c == " ".single()) continue
 
            val count = map.getOrDefault(c, defaultValue = 0)
            map[c] = count + 1
        }
        return map
    }

    // сортировка HashMap 
    fun sortHashMap(map: HashMap<Char, Int>){
        var sortedMap = mutableMapOf<Char, Int>()
           sortedMap = map
            sortedMap = hashMapForTry.entries.sortedBy { it.value }.associate { it.toPair() }
          println(sortedMap)
        //return sortedMap
    }
    // долгий способ
    fun wordLong(){
        val input = "outputName имя outputName - переписанного, файла / с текстом из файла  inputName."
        var words = mutableListOf<String>
        var currentWord = ""
        for (i in input.indices){
            if(i == input.length - 1){
                currentWord += input[i]
                words.add(currentWord)
            }
            if(input[i] == ' '){
                words.add(currentWord)
                currentWord = ""
            } else {
                currentWord =+ input[i]
            }
        }
        
        for (i in input.indices){
            words[i] = words[i].toLowerCase()
            if (words[i].endsWith('.')) || words[i].endsWith(',')){
                words[i] = words[i].substring(0, words[i].length - 1)
            }
        }
        
        var shortestLength = Int.MAX_VALUE
        for (i in words.indices){
            if (words[i].length == shortestLength){
                shortestLength.add(words[i])
            }
        }
        
        var shortestWords = mutableListOf<String>()
        for (i in words.indices){
            if (words[i].length == shortestLength){
                shortestWords.add(words[i])
            }
        }
        
        var repeatingWords = mutableListOf<String, Int>()
        for (i in words.indices){
            val currentCount = repeatingWords[words[i]] ?: 0
            repeatingWords[words[i]] =  currentCount + 1
        }
        
        println(input)
    }//wordLong


}//Sort()

fun main(){
    val sort = Sort()
    val text = sort.readFile("test1")
    sort.writeFile(text, "test2" )
    println(sort.quantityWord(text))
    println(sort.occurrencesOfCharacters(text))
    println("keys")
    println(sort.occurrencesOfCharacters(text).keys)
    println("values")
    println(sort.occurrencesOfCharacters(text).values)
    val a = sort.occurrencesOfCharacters(text)
    println("sort")
    //println(sort.sortHashMap(a))
}
