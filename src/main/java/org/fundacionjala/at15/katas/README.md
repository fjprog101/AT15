# Katas folder
Welcome to katas folder for AT15!

Under this folder, you can add your own folders for practicing katas presented in class, homework and any other that you wish.

## Folder structure
- For katas where the whole team works, create a folder with kata name and add your code files under that folder
```
katas/<kata name>/Main.java
katas/<kata name>/foo/Example.java
```

- For katas where subteams work, create a folder with kata name, a subfolder with team name and add your code files under that folder
```
katas/<kata name>/<team name>/Main.java
katas/<kata name>/<team name>/foo/Example.java
```

- For individual katas, create a folder with kata name, a subfolder with your name and add your code files under that folder
```
katas/<kata name>/<your name>/Main.java
katas/<kata name>/<your name>/foo/Example.java
```

## Run katas
To run the katas, use gradle wrapper included in the project. For using the gradle wrapper, add a gradle task in [build.gradle](../../../../../../../build.gradle) file with the name to run your kata (replace "runMyKataExample" with an unique name for your kata)
```
task runMyKataExample (dependsOn: 'classes', type: JavaExec) {
    main = '<Main class to run for kata>' // Exmaple: 'org.fundacionjala.at15.katas.langtonant.Main'
    classpath = sourceSets.main.runtimeClasspath
}
```

After adding the gradle task, run it using gradle wrapper
Windows
```
gradlew.bat -q runMyKataExample
```

Unix/Linux/Git Bash
```
./gradlew -q runMyKataExample
```