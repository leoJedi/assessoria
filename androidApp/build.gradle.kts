plugins {
    id(Plugins.androidFirebase)
    id(Plugins.androidApplication)
    kotlin(Plugins.android)
}

android {
    namespace = Namespaces.android
    compileSdk = Playstore.compileSdk

    defaultConfig {
        applicationId = Playstore.applicationId
        minSdk = Playstore.minSdk
        targetSdk = Playstore.targetSdk
        versionCode = Playstore.versionCode
        versionName = Playstore.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary =  true
        }

    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false


           // isShrinkResources = true

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )

        }
    }


    compileOptions{
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}

dependencies{
    implementation(project(":shared"))

    // CORE
    implementation(Androidx.core)
    implementation(Androidx.coreTeste)
    implementation(Androidx.coreTesteKtx)
    implementation(Androidx.lifecycleRuntime)

    // CORE LIBS
    implementation(Compose.ui)
    implementation(Compose.material) // MATERIAL 2
    implementation(Compose.toolingPreview)
    implementation(Compose.foundation)
    implementation(Compose.activity)
    implementation(Compose.layout)
    implementation(Compose.themeAdapter)
    implementation(Compose.runtime)

    implementation(Compose.runtime)

    //Tool BuildGradle
    //implementation(Compose.toolBuild) duplicado


    // ICON EXTENDED
    //implementation(Compose.materialIconsExtended)

    // MATERIAL 3 - MATERIAL YOU STATUS BAR
    implementation(Compose.systembars)


    // MATERIAL 3 - MATERIAL YOU
    implementation(Compose.materialGoogle)
    implementation(Compose.material3)

    // COMPOSE NAVIGATION
    implementation(Compose.navigation)
    implementation("com.google.firebase:firebase-common-ktx:20.4.2")

    // UNIT TEST
   testImplementation(Test.junit)

    // UI TESTE
    androidTestImplementation(TestUi.extJunit)
    androidTestImplementation(TestUi.espressoCore)
    androidTestImplementation(TestUi.uiUnitTest)
    androidTestImplementation(TestUi.uiAutomator)
    androidTestImplementation(TestUi.testeRun)

    //Firebase
    implementation(platform(Firebase.firebaseConfig))
    implementation(Firebase.firebaseDataBase)


    // DEBUGGING
    //debugImplementation(Compose.tooling)
    debugImplementation(Compose.composeTeste)


}