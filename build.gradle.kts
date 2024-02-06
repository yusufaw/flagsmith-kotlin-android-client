plugins {
    id("com.android.application").version("7.3.1").apply(false)
    id("com.android.library").version("7.3.1").apply(false)
    kotlin("android").version("1.6.10").apply(false)
    id("org.jetbrains.kotlinx.kover").version("0.6.1").apply(false)
}

val clean by tasks.registering(Delete::class) {
    delete(rootProject.buildDir)
}
