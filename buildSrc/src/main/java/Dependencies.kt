
// 1) Definir dependências / Android dolphin ja cria com compose
// 2) adicionar dependencias
// 3) enxergar o beneficio da centralização das dependências


/** PLAYSTORE VERSIONS */
object Playstore {
    const val applicationId = "br.com.empresa.nomeapp" // can't change once defined
    const val compileSdk = 33
    const val minSdk = 24
    const val targetSdk = 33
    const val versionCode = 1       // must be increased by every playstore upload
    const val versionName = "1.0.0" // you should increase too. Suggested approach (https://semver.org/)
}

object Namespaces {
    const val android = "br.com.empresa.nomeapp"
    const val shared = "br.com.empresa.common"
}

object Plugins {
    const val android = "android"
    const val androidLibrary = "com.android.library"
    const val androidApplication = "com.android.application"
    const val kotlin = "kotlin"
    const val multiplatform = "multiplatform"
    const val androidFirebase = "com.google.gms.google-services"


}

/** DEPENDENCY VERSIONS */
object Versions {
    const val compose = "1.3.0-alpha01"
    const val composeActivity = "1.5.0"
    const val composeCompiler = "1.4.2"
    const val composeThemeAdapter = "1.1.16"
    const val androidxCore = "1.9.0-alpha05"
    const val androidxCoreTeste = "1.5.0"
    const val androidxCoreTesteKtx = "1.5.0"
    const val lifecycleRuntime = "2.6.0-alpha01"
    const val junit = "4.13.2"
    const val junit4 = "1.5.3"
    const val extJunit = "1.1.5"
    const val extJunitKtx = "1.1.5"
    const val testManifest = "1.1.0-beta01"
    const val espressoCore = "3.5.1"
    const val kotlin = "1.8.10"
    const val pluginAndroidLib = "7.4.1"
    const val jetbrainsKotlin = "1.6.21"
    const val pluginAndroidApp = "7.4.1"
    const val compose_navigation = "2.5.0"
    const val androidx_icons_extended = "2.5.0"
    const val androidx_material3 = "1.0.0-alpha14"
    const val google_android_material = "1.6.1"
    const val android_systembars_ui_controler = "0.24.9-beta"
    const val toolBuildGrade = "7.4.1"
    const val uiautomator = "2.3.0-alpha02"
    const val testeRunVersion = "1.5.2"
    const val versionFirebase = "4.4.0"
    const val boomVersion = "32.3.1"



}

/**
 * APP DEPENDENCIES
 * How to add to build.gradle(:app)?
 * Ex: Inside dependencies{...} add: implementation Androidx.core
 */
object Androidx {
    const val core = "androidx.core:core-ktx:${Versions.androidxCore}"
    const val coreTeste = "androidx.test:core:${Versions.androidxCoreTeste}"
    const val coreTesteKtx = "androidx.test:core-ktx:${Versions.androidxCoreTesteKtx}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}"
}

object Firebase{
    const val firebaseConfig = "com.google.firebase:firebase-bom:${Versions.boomVersion}"
    const val firebaseDataBase = "com.google.firebase:firebase-database-ktx"


}


object Compose {
    const val activity = "androidx.activity:activity-compose:${Versions.composeActivity}"
    const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    const val layout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    //const val materialIconsExtended = "androidx.compose.material:material-icons-extended:${Versions.androidx_icons_extended}"
    const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
    const val themeAdapter = "com.google.android.material:compose-theme-adapter:${Versions.composeThemeAdapter}"
    const val tooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val navigation = "androidx.navigation:navigation-compose:${Versions.compose_navigation}"
    const val material3 = "androidx.compose.material3:material3:${Versions.androidx_material3}"
    const val materialGoogle = "com.google.android.material:material:${Versions.google_android_material}"
    const val composeTeste = "androidx.compose.ui:ui-test-manifest:${Versions.compose}"
    const val systembars = "androidx.compose.ui:ui-test-manifest:${Versions.android_systembars_ui_controler}"
    //const val toolBuild = "com.android.tools.build:gradle:${Versions.toolBuildGrade}"

}
/**
 * UNIT TEST
 * How to add to build.gradle(:app)?
 * Ex: Inside dependencies{...} add: testImplementation Test.junit
 */
object Test {
    const val junit = "junit:junit:${Versions.junit}"
}

/**
 * ANDROID UI TESTS
 * How to add to build.gradle(:app)?
 * Ex: Inside dependencies{...} add: androidTestImplementation TestUi.espressoCore
 */
object TestUi {
    const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
    const val extJuniJtxt = "androidx.test.ext:junit-ktx:${Versions.extJunitKtx}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val uiUnitTest = "androidx.compose.ui:ui-test-junit4:${Versions.junit4}"
    const val uiAutomator ="androidx.test.uiautomator:uiautomator:${Versions.uiautomator}"
    const val testeRun ="androidx.test:runner:${Versions.testeRunVersion}"
}

/**
 * DEBUG TESTS
 * How to add to build.gradle(:app)?
 * Ex: Inside dependencies{...} add: debugImplementation Debug.testManifest
 */
object Debug {
    const val testManifest = "androidx.compose.ui:ui-test-manifest:${Versions.testManifest}"
}