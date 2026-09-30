package app.vidacanhija.android

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform