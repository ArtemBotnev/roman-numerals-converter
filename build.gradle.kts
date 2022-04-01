plugins {
    kotlin("jvm") version "1.6.20"
    `java-library`
    `maven-publish`
}

group = "com.github.ArtemBotnev"
version = "1.1.4"

publishing {
    publications {
        create<MavenPublication>("RomanNumeralConverter") {
            from(components["java"])
        }
    }

    repositories {
        maven {
            name = "ArtemBotnev_Repo"
            url = uri(layout.buildDirectory.dir("repo"))
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
