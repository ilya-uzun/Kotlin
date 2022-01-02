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



}//Sort()

fun main(){
    val sort = Sort()
    val text = sort.readFile("test1")
    sort.writeFile(text, "test2" )
    println(sort.quantityWord(text))
}
