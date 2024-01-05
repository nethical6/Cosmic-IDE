plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    namespace = "io.appwrite.appwrite"
    compileSdk = 34

    defaultConfig {
        minSdk = 21

        buildConfigField("String", "SDK_VERSION", "\"4.0.1\"")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures.buildConfig = true

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0-RC2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.0-RC2")

    implementation(platform("com.squareup.okhttp3:okhttp-bom:5.0.0-alpha.12"))
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:okhttp-urlconnection")
    implementation("com.squareup.okhttp3:logging-interceptor")
    implementation("com.google.code.gson:gson:2.10.1")

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0-rc02")
    implementation("androidx.appcompat:appcompat:1.7.0-alpha03")
    implementation("androidx.fragment:fragment-ktx:1.7.0-alpha07")
    implementation("androidx.activity:activity-ktx:1.9.0-alpha01")
    implementation("androidx.browser:browser:1.7.0")
}