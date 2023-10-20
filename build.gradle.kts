plugins {
    //trick: for the same plugin versions in all sub-modules
    id(Plugins.androidApplication).version(Versions.pluginAndroidApp).apply(false)
    id(Plugins.androidLibrary).version(Versions.pluginAndroidLib).apply(false)

    id(Plugins.androidFirebase).version(Versions.versionFirebase).apply(false)

    //id("com.google.gms.google-services") version "4.4.0" apply false

    kotlin(Plugins.android).version(Versions.kotlin).apply(false)
    kotlin(Plugins.multiplatform).version(Versions.kotlin).apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
