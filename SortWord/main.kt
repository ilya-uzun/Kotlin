import java.io.File
/**
 *
 * readFile чтение файла.
 * outputName имя переписанного файла с текстом из файла  inputName.
 * quantityWord - считает количестослов в файле
 */
class Sort(){
    //Прочитать файл и перевести в нижний регист
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
    fun numberOfCher(text: String): Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()
        for (c in text) {
            // Игнорируем пробелы.
            if(c == " ".single()) continue
 
            val count = map.getOrDefault(c, defaultValue = 0)
            map[c] = count + 1
        }
        return map
    }


    fun numberOfWords(text: String){

        fun filterEngihg(c: Char): (String) -> String = {s -> s.takeIf{it.endsWith(c)}?.dropLast(1)?: s}
        var f = File("test3")
        val words = text.split(" ").map(String::lowercase)
            .map(filterEngihg(','))
            .map(filterEngihg('.'))
            .map(filterEngihg('('))
            .map(filterEngihg(')'))
            .map(filterEngihg(':'))
            .map(filterEngihg('-'))
        
        val wordsCount = words.groupingBy{ it }.eachCount()
        
        //val shortestLength = words.minByOrNull{ it.length }?.length
        
        //val shortestWords = words.filter{ it.length == shortestLength }
        
        wordsCount.map { (k, v) -> "$k: $v" }.forEach(::println)

        //println(shortestWords.joinToString(", "))
    }//wordShort

}//Sort()

fun main(){
    val sort = Sort()
    
    val text = sort.readFile("text")
    //println(sort.quantityWord(text))
    //println(sort.numberOfCher(text))
    //sort.writeFile(text, "test2" )
    /*
    println(sort.quantityWord(text))
    println(sort.occurrencesOfCharacters(text))
    println("keys")
    println(sort.occurrencesOfCharacters(text).keys)
    println("values")
    println(sort.occurrencesOfCharacters(text).values)
    val a = sort.occurrencesOfCharacters(text)
    println("sort")
    */
    println("___")
    sort.numberOfWords(text)
}
/*  код не работает
    // долгий способ
    fun wordLong(){
        val input = "outputName inputName."
        var words = mutableListOf<String>()
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
                currentWord += input[i]
            }
        }
        
        for (i in input.indices){
            words[i] = words[i].lowercase()
            if (words[i].endsWith('.') || words[i].endsWith(',')){
                words[i] = words[i].substring(0, words[i].length - 1)
            }
        }
        
        var shortestLength = Int.MAX_VALUE
        for (i in words.indices){
            if (words[i].length < shortestLength){
                shortestLength = words[i].length
            }
        }
        // самое короткое слово
        val shortestWords = mutableListOf<String>()
        for (i in words.indices){
            if (words[i].length == shortestLength){
                shortestWords.add(words[i])
            }
        }
        // повторяющиеся слова
        val repeatingWords = mutableMapOf<String, Int>()
        for (i in words.indices){
            val currentCount = repeatingWords[words[i]] ?: 0
            repeatingWords[words[i]] =  currentCount + 1
        }
        
        for(k in repeatingWords.keys){
            println("$k: ${repeatingWords[k]}")
        }
        
        println("---")
        println(shortestWords.joinToString(", "))
    }//wordLong
    
    */
