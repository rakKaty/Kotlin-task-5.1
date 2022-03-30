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
        val postId = newPost.component1()
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                val ownerIdOld = posts[index].component2()
                val dateOld = posts[index].component5()
                posts[index] = newPost.copy(owner_id = ownerIdOld, date = dateOld)

                return true
            }
        }
        return false
    }

    fun print() {
        for (post in posts) {
            println("post.id = " + post.id +
                    ", post.owner_id = " + post.owner_id +
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
