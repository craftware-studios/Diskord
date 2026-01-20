plugins {
    kotlin("jvm") version "2.2.20"
}

group = "ru.ttlzmc.jkdbl"
version = "1.0-SNAPSHOT"

val jdaVersion = project.properties["java.discord.api"].toString()

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.dv8tion:JDA:$jdaVersion")
}

kotlin {
    jvmToolchain(24)
}