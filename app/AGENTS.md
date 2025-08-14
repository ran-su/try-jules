## Building the Native Android App

This directory contains a native Android application that reimplements the website's presentation functionality. To build the app, you will need the Android SDK installed and configured on your system.

### Build Command

Once you have the Android SDK set up, you can build the application by running a gradle command.

**Note on Gradle Wrapper:** This project does not include the Gradle wrapper scripts (`gradlew`). In a standard Android Studio project, these are generated automatically. To build from the command line, you would typically use the wrapper. If you have Gradle installed on your system, you can use the `gradle` command directly. Alternatively, you can generate the wrapper by running `gradle wrapper` in the project root.

Assuming the wrapper has been generated, you can build the app with:
```bash
./gradlew :app:assembleDebug
```

This will generate an APK file in the `app/build/outputs/apk/debug/` directory. This APK can then be installed on an Android device or emulator.
