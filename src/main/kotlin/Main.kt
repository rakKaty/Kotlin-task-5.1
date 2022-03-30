fun main() {

    val comments1 = Comments(900, true, true, true, true)
    val copyright1 = Copyright(333, "www.111.ru", "K", "rights")
    val likes1 = Likes(1100, true, true, true)
    val donut1 = Donut(false, 444, "L", true, "y")
    val reposts1 = Reposts(777, true)
    val views1 = Views(450)
    val postSource1 = PostSource(Type.vk, Platform.android, DataTypePostSource.profile_photo, "2222.com")
    val place1 = Place(
        11235,
        "название места 1",
        10,
        20,
        210398,
        "icon1.com",
        888,
        110899,
        567,
        45,
        33,
        "адрес места"
    )
    val geo1 = Geo("тип места 1", "координаты места 1", place1)

    val postSource2 = PostSource(Type.widget, Platform.iphone, DataTypePostSource.poll, "45454.com")
    val place2 = Place(
        44445,
        "название места 2",
        40,
        60,
        50620,
        "icon2.com",
        999,
        140821,
        786,
        85,
        43,
        "адрес места 2"
    )
    val geo2 = Geo("тип места 2", "координаты места 2", place2)

    val postSource3 = PostSource(Type.api, Platform.android, null, "3333.com")
    val place3 = Place(
        4567,
        "название места 3",
        -10,
        -20,
        171099,
        "icon3.com",
        7640,
        150920,
        877,
        90,
        14,
        "адрес места 3"
    )
    val geo3 = Geo("тип места 3", "координаты места 3", place3)

    val graffiti1 = Graffiti(123, 345, "photo 130", "photo 604")
    val audio1 = Audio(
        111,
        555,
        "fri",
        "ooo",
        9999,
        "www.777.com",
        4567,
        6823,
        4562,
        6765,
        false,
        false
    )
    val link1 = Link(
        "link url",
        "link title",
        "link caption",
        "link description",
        null,
        909,
        null,
        "preview page",
        "preview url"
    )


    val post1 = Post(
        1,
        123,
        222,
        111,
        250322,
        "Post1 text",
        567,
        888,
        true,
        comments1,
        copyright1,
        likes1,
        reposts1,
        views1,
        PostType.Copy,
        900,
        true,
        true,
        true,
        true,
        true,
        true,
        donut1,
        true,
        postSource1,
        geo1,
        null,
        GraffitiAttachment(graffiti1)
    )

    val post2 = Post(
        1,
        456,
        222,
        111,
        200320,
        "Post2 text",
        567,
        888,
        true,
        comments1,
        copyright1,
        likes1,
        reposts1,
        views1,
        PostType.Copy,
        900,
        true,
        true,
        true,
        true,
        true,
        true,
        donut1,
        true,
        postSource2,
        geo2,
        null,
        AudioAttachment(audio1)
    )

    val post3 = Post(
        3,
        789,
        222,
        111,
        250419,
        "Post3 text",
        567,
        888,
        true,
        comments1,
        copyright1,
        likes1,
        reposts1,
        views1,
        PostType.Copy,
        900,
        true,
        true,
        true,
        true,
        true,
        true,
        donut1,
        true,
        postSource3,
        geo3,
        null,
        LinkAttachment(link1)
    )

    WallService.add(post1)
    WallService.add(post2)
    WallService.update(post3)
    WallService.add(post3)
    WallService.print()
}