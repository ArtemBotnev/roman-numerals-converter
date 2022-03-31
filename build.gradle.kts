plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
    `java-library`
}

group = "com.github.ArtemBotnev"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}