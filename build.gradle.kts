plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation(platform("io.strikt:strikt-bom:0.34.1"))
    testImplementation("io.strikt:strikt-core")
    testImplementation("io.strikt:strikt-jvm")
    //testImplementation("io.strikt:strikt-mockk")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}