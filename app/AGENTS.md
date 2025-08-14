## Building the Android App

This directory contains an Android application that wraps the website. To build the app, you will need the Android SDK installed and configured on your system.

### Build Command

Once you have the Android SDK set up, you can build the application by running the following command from the root of the project:

```bash
./gradlew :app:assembleDebug
```

This will generate an APK file in the `app/build/outputs/apk/debug/` directory. This APK can then be installed on an Android device or emulator.
