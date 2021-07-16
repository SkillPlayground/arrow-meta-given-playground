package com.javiersc.arrow.meta.given.playground.presentation

import com.javiersc.arrow.meta.given.playground.open.GetUser
import com.javiersc.arrow.meta.given.playground.shared.Given

@Given
class UserViewModel(@Given private val getUser: GetUser) {

    fun loadUser(): String = getUser()
}
