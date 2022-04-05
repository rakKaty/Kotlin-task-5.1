object WallService {
    private var posts = emptyArray<Post>()
    private var lastIdUnique: Int = 1

    fun add(newPost: Post): Post {
        val postUniqueId = newPost.copy(id = generateId())
        posts += postUniqueId
        return posts.last()
    }

    private fun generateId(): Int {
        lastIdUnique += 1
        return lastIdUnique - 1
    }

    fun update(newPost: Post): Boolean {
        val postId = newPost.id
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                val ownerIdOld = posts[index].ownerId
                val dateOld = posts[index].date
                posts[index] = newPost.copy(ownerId = ownerIdOld, date = dateOld)

                return true
            }
        }
        return false
    }

    fun print() {
        for (post in posts) {
            println("post.id = " + post.id +
                    ", post.ownerId = " + post.ownerId +
                    ", date = " + post.date +
                    ", text = " + post.text +
                    ", attachments = " + post.attachment
            )
        }
    }

    fun clearArray() {
        posts = emptyArray()
        lastIdUnique = 1
    }
}
