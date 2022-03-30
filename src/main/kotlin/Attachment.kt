sealed class Attachment(val type: String)


data class PhotoAttachment(val photo: Photo) : Attachment("photo")
data class LinkAttachment(val link: Link) : Attachment("link")
data class AudioAttachment(val audio: Audio) : Attachment("audio")
data class StickerAttachment(val sticker: Sticker) : Attachment("sticker")
data class GraffitiAttachment(val graffiti: Graffiti) : Attachment("graffiti")


data class Photo(
    val id: Int,
    val album_id: Int,
    val owner_id: Int,
    val user_id: Int,
    val text: String,
    val date: Int,
    val sizes: Array<PhotoSizes>,
    val width: Int,
    val height: Int,
)
data class PhotoSizes(val type: String, val url: String, val width: Int, val height: Int)


data class Link(
    val url: String,
    val title: String,
    val caption: String,
    val description: String,
    val photo: Photo?,
    val product: Int,
    val button: Button?,
    val preview_page: String,
    val preview_url: String,
)
data class Button(val type: String)


data class Audio(
    val id: Int,
    val owner_id: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyrics_id: Int,
    val album_id: Int,
    val genre_id: Int,
    val date: Int,
    val no_search: Boolean,
    val is_hq: Boolean,
)


data class Sticker(
    val product_id: Int,
    val sticker_id: Int,
    val images: Array<ImagesTransparentBackground>,
    val images_with_background: Array<ImagesWithBackground>,
)
data class ImagesTransparentBackground(val url: String, val width: Int, val height: Int)
data class ImagesWithBackground(val url: String, val width: Int, val height: Int)


data class Graffiti(
    val id: Int,
    val owner_id: Int,
    val photo_130: String,
    val photo_604: String,
)
