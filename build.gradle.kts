plugins {
    kotlin("jvm") version "2.2.20"
}

group = "ru.ttlzmc.jkdbl"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.jda)
}

kotlin {
    jvmToolchain(24)
}