plugins {
    kotlin("jvm") version "2.0.21"
    application
}

group = "id.ac.praktikum.oop"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("MainKt")
}

kotlin {
    jvmToolchain(17)
}

tasks.test {
    useJUnitPlatform()
}

// Agar input keyboard terbaca saat menjalankan gradlew run
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}