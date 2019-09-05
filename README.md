# Kotlin-Espresso-Sample


## Run tests

You have to have a connected device in advance in order to run `UI tests`. It doesn't matter if it's a simulator and a real one.

### Using Android Studio

|   |UI Tests (using Espresso)|Unit Tests (using JUnit4)|
|---|----------------------|-----------------------|
|Gradle task name|`connectedAndroidTest`<br/><br/>![Run Task](img/uitask.png)|`testDebugUnitTest`<br/><br/>![Run Unit Test](img/unittask.png)|
|Location of test code|`src/androidTest/kotlin`<br/>![Path](img/uitest_path.png)|`src/test/kotlin`<br/>![Path](img/unittest_path.png)|
|Prefix of dependencies defined in `build.gradle`|`androidTestCompile`|`testCompile`|
