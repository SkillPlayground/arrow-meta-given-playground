package com.javiersc.arrow.meta.given.playground.internal

import com.javiersc.arrow.meta.given.playground.shared.Given

class RemoteDataSource {

    val user: String = "Javier"
}

// Simulating third party libraries, i.e. Retrofit
@Given fun givenRemoteDataSource(): RemoteDataSource = RemoteDataSource()
