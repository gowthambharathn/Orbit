plugins {
    base
    `maven-publish`
}

group = "com.github.gowthambharathn"
version = "1.0.2"

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.gowthambharathn"
            artifactId = "Orbit"
            version = "1.0.2"

            artifact(file("orbit-release.aar"))

            pom {
                name.set("Orbit")
                description.set(
                    "Reusable Android UI components and utilities"
                )

                url.set(
                    "https://github.com/gowthambharathn/Orbit"
                )
            }
        }
    }
}
