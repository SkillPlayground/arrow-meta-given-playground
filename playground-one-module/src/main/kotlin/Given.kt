package com.javiersc.arrow.meta.given.playground.one.module

import arrow.Context

@Context
@Retention(AnnotationRetention.RUNTIME)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.VALUE_PARAMETER
)
annotation class Given

inline fun <A> given(@Given identity: A): A = identity
