import java.io.File
/**
 *
 * readFile чтение файла.
 * outputName имя переписанного файла с текстом из файла  inputName.
 * quantityWord - считает количестослов в файле
 */
class Sort(){

    fun readFile(inputName: String): String = File(inputName).readText()

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

/*
    fun countingWords(text: String): HashMap<String, Int> {
        var frequency = HashMap<String, Int>()// Пустая Хеш таблица

        for(i in text){
            var temp = text.nextLine()

            if(frequency.containsKey(temp)) {
                var count = frequency.get(temp);
                frequency.put(temp, Integer.sum(count, 1))
            } else {
                frequency.put(temp, 1)
            }
    
        }
    return frequency
    }//countingWords // https://translated.turbopages.org/proxy_u/en-ru.ru.14401952-61d1b10c-98ccbbcd-74722d776562/https/stackoverflow.com/questions/36967655/count-same-lines-in-a-file-java
*/
    // считаем количесва знаков
    fun occurrencesOfCharacters(text: String): Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()
        for (c in text) {
            // Игнорируем пробелы.
            if(c == " ".single()) continue
 
            val count = map.getOrDefault(c, defaultValue = 0)
            map[c] = count + 1
        }
        //val sorted = map.toSortedMap()
        return map
    }

    // сортировка HashMap 
    fun sortHashMap(map: Map<Char, Int>): Map<Char, Int>{
        val sortedMap = map.toSortedMap()
         sortedMap.values
        return sortedMap
    }

}//Sort()

fun main(){
    val sort = Sort()
    val text = sort.readFile("test1")
    sort.writeFile(text, "test2" )
    println(sort.quantityWord(text))
    println(sort.occurrencesOfCharacters(text))

    val a = sort.occurrencesOfCharacters(text)
    println(sort.sortHashMap(a))
}
