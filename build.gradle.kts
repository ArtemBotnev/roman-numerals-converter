plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
    id("maven-publish")
    `java-library`
}

group = "com.github.ArtemBotnev"
version = "1.1.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
