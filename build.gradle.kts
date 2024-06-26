// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
    repositories{
        google()
        mavenCentral()
    }

    dependencies{
            classpath("com.android.tools.build:gradle:7.3.1")
            classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
            classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
            classpath("com.google.dagger:hilt-android-gradle-plugin:2.50")
    }
}
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}