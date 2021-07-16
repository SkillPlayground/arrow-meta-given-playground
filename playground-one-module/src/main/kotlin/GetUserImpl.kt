package com.javiersc.arrow.meta.given.playground.one.module

@Given
class GetUserImpl(@Given private val remoteDataSource: RemoteDataSource) : GetUser {

    override fun invoke(): String = remoteDataSource.user
}
