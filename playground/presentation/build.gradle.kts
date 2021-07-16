import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("io.arrow-kt.proofs")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-XXLanguage:+InlineClasses", "-Xjvm-default=enable")
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(projects.playground.open)
    implementation(projects.playground.shared)
}
