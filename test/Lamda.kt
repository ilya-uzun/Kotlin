import kotlin.random.Random
fun main(){
    val posts = listOf(
        InstagramPost(id = 0, Picture(generateRandomData(length = 256))),
        InstagramPost(id = 1, listOf(Picture(generateRandomData(length=256)), Picture(generateRandomData(length=256)))),
        InstagramPost(id = 2, Video(generateRandomData(length = 256)))
    )
    println(posts)
}

fun generateRandomData(length: Int): ByteArray = Random.nextBytes(length)

class Picture(val data: ByteArray){

}

class Video(val data: ByteArray){

}

class InstagramPost<T>(val id: Long, val content: T ){
    override fun toString(): String {
        return "InstagramPost(id=$id, content=$content)"
    }
}