plugins {
    id("dedalus.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":dedalus-java-core"))
    implementation(project(":dedalus-java-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :dedalus-java-example:run` to run `Main`
    // Use `./gradlew :dedalus-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.dedalus.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
