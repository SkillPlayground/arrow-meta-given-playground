package com.javiersc.arrow.meta.given.playground.one.module

class RemoteDataSource {

    val user: String = "Javier"
}

// Simulating third party libraries, i.e. Retrofit
@Given fun givenRemoteDataSource(): RemoteDataSource = RemoteDataSource()
