package com.javiersc.arrow.meta.given.playground.internal

import com.javiersc.arrow.meta.given.playground.open.GetUser
import com.javiersc.arrow.meta.given.playground.shared.Given

@Given
class GetUserImpl(@Given private val remoteDataSource: RemoteDataSource) : GetUser {

    override fun invoke(): String = remoteDataSource.user
}
