

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.72"

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use JCenter for resolving dependencies.
    jcenter()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:29.0-jre")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    implementation(platform("org.http4k:http4k-bom:4.4.0.1"))
    implementation("org.http4k:http4k-core:4.4.0.1")
    implementation("org.http4k:http4k-server-netty:4.4.0.1")
    implementation("org.http4k:http4k-format-kotlinx-serialization:4.5.0.1")
    implementation("org.http4k:http4k-format-jackson:4.5.0.1")
}

application {
    // Define the main class for the application.
    mainClass.set("academy.learnprogrammin.helloworld.serrfcorptest")
}