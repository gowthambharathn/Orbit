plugins {
    `maven-publish`
}

group = "com.github.gowthambharathn"
version = "1.0.0"

publishing {
    publications {
        create<MavenPublication>("release") {

            groupId = "com.github.gowthambharathn"
            artifactId = "Orbit"
            version = "1.0.0"

            artifact("orbit-release.aar")

            pom {
                name.set("Orbit")

                description.set(
                    "A reusable Android development toolkit with Jetpack Compose UI components and utilities."
                )

                url.set("https://github.com/gowthambharathn/Orbit")
            }
        }
    }
}
