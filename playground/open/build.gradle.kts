import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins { kotlin("jvm") }

kotlin.sourceSets.all { kotlin.srcDirs(name) }

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-XXLanguage:+InlineClasses", "-Xjvm-default=enable")
        jvmTarget = "1.8"
    }
}
