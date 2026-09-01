# Orbit

A modern Android development toolkit designed to help developers build Android applications faster.

Orbit provides reusable Jetpack Compose UI components, a consistent design system, utility functions, and developer-friendly tools that can be reused across multiple Android projects.

The goal of Orbit is simple:

> Build production-ready Android applications faster with reusable, scalable components.

---

## ✨ Features

- Modern Jetpack Compose UI components
- Reusable application backgrounds
- Consistent UI theme and design system
- Graph and visualization components
- Reusable utility functions
- Developer-friendly APIs
- Modular architecture
- Designed for rapid Android development
- Easily expandable with new UI and core features

---

## 🚀 Installation

### Step 1: Add JitPack

Add JitPack to your `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}
```

### Step 2: Add the Dependency

```kotlin
dependencies {
    implementation("com.github.gowthambharathn:Orbit:VERSION")
}
```

Replace `VERSION` with the required release or tag.

---

## 📦 What's Inside

Orbit is designed to grow into a complete Android development toolkit.

```text
Orbit
│
├── UI
│   ├── Theme
│   ├── Background
│   ├── Components
│   └── Graph
│
├── Core
│   ├── Extensions
│   ├── Utilities
│   └── Helpers
│
├── Network
│
├── Storage
│
└── Architecture
```

---

## 🎨 UI

Orbit includes reusable Jetpack Compose components that can be used across multiple applications.

Example:

```kotlin
@Composable
fun App() {
    OrbitTheme {
        // Your application UI
    }
}
```

---

## 🎯 Goal

Orbit is built with the idea of reducing repeated development work.

Instead of rebuilding common UI components, themes, utilities, and helper functions for every project, Orbit provides a reusable foundation.

The long-term vision is to make Android development faster and more consistent.

```text
Build Once
↓
Reuse Everywhere
↓
Build Apps Faster
```

---

## 🛠 Tech Stack

- Kotlin
- Jetpack Compose
- Material 3
- AndroidX

---

## 📈 Roadmap

### Current

- [x] Reusable UI components
- [x] Custom background system
- [x] Graph components
- [x] Theme system
- [x] Core utilities

### Future

- [ ] Networking utilities
- [ ] Storage helpers
- [ ] Architecture utilities
- [ ] API helpers
- [ ] State management tools
- [ ] Animation components
- [ ] Form components
- [ ] Advanced graph components
- [ ] More reusable UI components

---

## 🤝 Contributions

Orbit is currently developed and maintained as an evolving Android toolkit.

Contributions, suggestions, and improvements are welcome.

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

**Gowtham Bharath N**

Android Developer | Kotlin | Jetpack Compose

---

⭐ If you find Orbit useful, consider giving the repository a star.
