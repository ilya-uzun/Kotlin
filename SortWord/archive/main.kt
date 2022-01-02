import java.io.File
/**
 *
 * inputName имя первоначального файла с текстом.
 * outputName имя переписанного файла с текстом из файла  inputName.
 */
class Sort(){

    fun readFile(inputName: String): String = File(inputName).readText()

    fun writeFile(text: String, outputName: String){
        val f = File(outputName)
            if (!f.exists()) {
                f.createNewFile()
            } 
        f.writeText(text)
   }

/*
    fun writeFile(outputName: String){
    }

    fun writeFile(inputName: String,  outputName: String){
        val writer = File(outputName).bufferedWriter()
        for (line in File(inputName).readLines()) {

            for (word in line.split(Regex("\n"))) {
                writer.write(" ")
                writer.write(word)
            }
        writer.close()
       }
    }
*/
}

fun main(){
    val sort = Sort()
    
    sort.writeFile(sort.readFile("test1"), "test2" )
}
