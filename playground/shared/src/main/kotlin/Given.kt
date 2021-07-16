package com.javiersc.arrow.meta.given.playground.shared

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
