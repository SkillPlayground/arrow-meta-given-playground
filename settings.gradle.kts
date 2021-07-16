enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots") {
            content { includeGroup("io.arrow-kt") }
        }
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

pluginManagement {
    repositories {
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots") {
            content { includeGroup("io.arrow-kt") }
        }
        gradlePluginPortal()
        google()
    }
}

include(
    //    ":playground:app",
    //    ":playground:internal",
    //    ":playground:open",
    //    ":playground:presentation",
    //    ":playground:shared",
    ":playground-one-module",
)
