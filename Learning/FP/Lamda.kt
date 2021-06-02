import kotlin.random.Random
fun main(){
    val posts = listOf(
        InstagramPost(id = 0, Picture(generateRandomData(length = 256)), ::pictureDownloader),
        InstagramPost(id = 1, listOf(Picture(generateRandomData(length=256)), Picture(generateRandomData(length=256))),
            {pictures ->
                pictures 
                .map (::pictureDownloader)
                .fold(byteArrayOf(), {acc, item -> acc + item }) }),
        InstagramPost(id = 2, Video(generateRandomData(length = 1024)), ::videoDownloader)
    )
   // println(posts)

    val downloadedContent = posts.map { post -> post.dowloand() }.map { it.size }
    //  post - переменная 
    //  post.dowloand() - у каждого вызываем фенкцию dowloand() 
     println(downloadedContent)
}

fun pictureDownloader(pic: Picture): ByteArray = pic.data
fun videoDownloader(video: Video): ByteArray = video.data

fun generateRandomData(length: Int): ByteArray = Random.nextBytes(length)

class Picture(val data: ByteArray){

}

class Video(val data: ByteArray){

}

class InstagramPost<T>(val id: Long, val content: T, var downloader: (T) -> ByteArray ){
    override fun toString(): String {
        return "InstagramPost(id=$id, content=$content)"
    }

    fun dowloand(): ByteArray = downloader(content)
}