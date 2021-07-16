buildscript {
    repositories {
        mavenLocal() { content { includeGroup("io.arrow-kt") } }
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots") {
            content { includeGroup("io.arrow-kt") }
        }
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
        classpath("io.arrow-kt:arrow-proofs-gradle-plugin:1.5.10-SNAPSHOT")
    }
}
