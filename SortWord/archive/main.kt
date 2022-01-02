import java.io.File
/**
 *
 * inputName имя первоначального файла с текстом.
 * outputName имя переписанного файла с текстом из файла  inputName.
 */
class Sort(){

    fun writeFile(inputName: String,  outputName: String){
        val writer = File(outputName).bufferedWriter()
        for (line in File(inputName).readLines()) {
            if (line.isEmpty()) {
                writer.newLine()
            }
            for (word in line.split(Regex("\\s"))) {
                writer.write(" ")
                writer.write(word)
            }
        writer.close()
       }
   }
}

fun main(){
    val sort = Sort()
    sort.writeFile("test1", "test2")

}
