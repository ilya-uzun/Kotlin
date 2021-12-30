

class Sort(){

/**
 *
 * Во входном файле с именем inputName содержится некоторый текст.
 * Вывести его в выходной файл с именем outputName, выровняв по левому краю,
 * чтобы длина каждой строки не превосходила lineLength.
 * Слова в слишком длинных строках следует переносить на следующую строку.
 * Слишком короткие строки следует дополнять словами из следующей строки.
 * Пустые строки во входном файле обозначают конец абзаца,
 * их следует сохранить и в выходном файле
 */

fun alignFile(inputName: String, lineLength: Int, outputName: String) {
    val writer = File(outputName).bufferedWriter()
    var currentLineLength = 0
    for (line in File(inputName).readLines()) {
        if (line.isEmpty()) {
            writer.newLine()
            if (currentLineLength > 0) {
                writer.newLine()
                currentLineLength = 0
            }
        }
        for (word in line.split(Regex("\\s+"))) {
            if (currentLineLength > 0) {
                if (word.length + currentLineLength >= lineLength) {
                    writer.newLine()
                    currentLineLength = 0
                }
                else {
                    writer.write(" ")
                    currentLineLength++
                }
            }
            writer.write(word)
            currentLineLength += word.length
        }
    }
    writer.close()
}
}
