/* Идея была перевести код на язык java
*  Решил не продожать чтобы не распылять внимания с Kotlin
*/


import java.io.*;
public class Main{

    public static void main(){
        Sort sort = new Sort();
        String text = sort.readFile("test1");
        sort.writeFile(text, "test2" );
        /*
        System.out.printf(sort.quantityWord(text));
        System.out.printf(sort.occurrencesOfCharacters(text));
        System.out.printf("keys");
        System.out.printf(sort.occurrencesOfCharacters(text).keys);
        System.out.printf("values");
        System.out.printf(sort.occurrencesOfCharacters(text).values);
        val a = sort.occurrencesOfCharacters(text);
        System.out.printf("sort");
        */
    } 
}


public class Sort{
    
    public Sort(){
    }

    public static String readFile(string inputName){
        File(inputName).readText().lowercase();
    } 

    public static void writeFile(string text, string outputName){
        File f = new File(outputName);
            if (!f.exists()) {
                f.createNewFile()
            } 
        f.writeText(text)
    }//writeFile
    

    /**
    * trim() - Удалит пробел в конце файла
    * Функция считает количество пробелов
    */
/*
    public static int quantityWord(string text){
        Regex("""(\s+|(\r\n|\r|\n))""").findAll(text.trim()).count() + 1;
    } 
    // считаем количесва знаков
    public static map occurrencesOfCharacters(String text){
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
    public static void sortHashMap(map: HashMap<Char, Int>){
        var sortedMap = mutableMapOf<Char, Int>()
           sortedMap = map
            sortedMap = hashMapForTry.entries.sortedBy { it.value }.associate { it.toPair() }
          println(sortedMap)
        //return sortedMap
    } 
*/
}//Sort()