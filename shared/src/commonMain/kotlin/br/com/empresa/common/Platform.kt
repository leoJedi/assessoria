package br.com.empresa.common

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform