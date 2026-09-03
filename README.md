# 🌌 Nova Design System for Jetpack Compose

A modern, cohesive, and theme-adaptive UI design system built with **Jetpack Compose**.

Nova provides reusable UI components with ambient glow effects, gradient surfaces, custom controls, smooth animations, and support for both Light and Dark themes.

---

## 🛠 Features

* **Theme-Adaptive** — Supports both Light and Dark themes.
* **Ambient Glow Effects** — Radial background highlights and custom borders.
* **Reusable Components** — Ready-to-use cards, buttons, text fields, toggles, and sliders.
* **Idiomatic Kotlin** — Designed with clean APIs, trailing lambdas, and type-safe enums.
* **Interactive UI** — Stateful components with smooth animations.
* **Jetpack Compose Native** — Built specifically for modern Android UI development.

---

## 📦 Components Overview

| Component      | Class / Function | Description                                                             |
| :------------- | :--------------- | :---------------------------------------------------------------------- |
| **Background** | `NovaBackground` | Fullscreen background container with a localized ambient radial glow.   |
| **Card**       | `NovaCard`       | Container with theme-aware gradient backgrounds and borders.            |
| **Button**     | `NovaButton`     | Modern button with custom borders, elevation, and click interactions.   |
| **Text Field** | `NovaTextField`  | Custom input field with animated focus borders and icon slots.          |
| **Toggle**     | `NovaToggle`     | Segmented control with a sliding pill indicator and smooth transitions. |
| **Slider**     | `NovaSlider`     | Theme-adaptive slider with custom tracks and thumb styling.             |

---

# 🚀 Component Usage & Examples

## 1. NovaBackground

`NovaBackground` wraps your screen and renders a subtle ambient radial glow behind your content.

```kotlin
NovaBackground(
    position = GlowPosition.TOP_RIGHT,
    isDarkTheme = isSystemInDarkTheme()
) {
    // Write your screen UI layout here
}
```

### Available Glow Positions

```kotlin
GlowPosition.TOP_RIGHT
GlowPosition.BOTTOM_LEFT
GlowPosition.CENTER
```

---

## 2. NovaCard

A reusable container with subtle gradient fills, rounded corners, borders, and theme-aware shadows.

```kotlin
NovaCard(
    modifier = Modifier.fillMaxWidth(),
    contentPadding = 16.dp,
    cornerRadius = 18.dp
) {
    Text(
        text = "Nova Analytics",
        fontWeight = FontWeight.Bold
    )

    Text(
        text = "System performance is optimal."
    )
}
```

### Parameters

| Parameter        | Description                                    |
| :--------------- | :--------------------------------------------- |
| `modifier`       | Modifier used to customize layout and size.    |
| `contentPadding` | Inner padding of the card. Default is `16.dp`. |
| `cornerRadius`   | Controls the roundness of the card corners.    |
| `content`        | Composable content displayed inside the card.  |

---

## 3. NovaButton

A modern action button with custom borders, elevation, enabled states, and click interactions.

### Basic Usage

```kotlin
NovaButton(
    text = "Get Started"
) {
    // Handle click action
}
```

### Full Width Button

```kotlin
NovaButton(
    text = "Submit Request",
    enabled = true,
    modifier = Modifier.fillMaxWidth(),
    onClick = {
        // Handle submit action
    }
)
```

### Disabled Button

```kotlin
NovaButton(
    text = "Submit",
    enabled = false,
    onClick = {
        // This will not trigger while disabled
    }
)
```

---

## 4. NovaTextField

An interactive text input component with animated focus borders, placeholder hints, and optional icon slots.

```kotlin
var emailText by remember {
    mutableStateOf("")
}

NovaTextField(
    value = emailText,
    onValueChange = {
        emailText = it
    },
    hint = "Enter your email address",
    modifier = Modifier.fillMaxWidth(),
    leadingIcon = {
        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = null,
            tint = Color(0xFF2196F3)
        )
    }
)
```

### Basic Usage

```kotlin
var username by remember {
    mutableStateOf("")
}

NovaTextField(
    value = username,
    onValueChange = {
        username = it
    },
    hint = "Enter username"
)
```

---

## 5. NovaToggle

A multi-option segmented toggle with a sliding active indicator and smooth transitions.

```kotlin
var selectedIndex by remember {
    mutableIntStateOf(0)
}

val options = listOf(
    "Overview",
    "Analytics",
    "Settings"
)

NovaToggle(
    options = options,
    selectedIndex = selectedIndex,
    onToggle = { newIndex ->
        selectedIndex = newIndex
    },
    modifier = Modifier.fillMaxWidth()
)
```

### Example

```kotlin
var selectedTab by remember {
    mutableIntStateOf(0)
}

NovaToggle(
    options = listOf(
        "Day",
        "Week",
        "Month"
    ),
    selectedIndex = selectedTab,
    onToggle = {
        selectedTab = it
    }
)
```

---

## 6. NovaSlider

A theme-aware slider with custom tracks, smooth interactions, and styled thumb borders.

```kotlin
var brightness by remember {
    mutableFloatStateOf(65f)
}

NovaSlider(
    value = brightness,
    onValueChange = {
        brightness = it
    },
    valueRange = 0f..100f,
    modifier = Modifier.fillMaxWidth()
)
```

### Example: Volume Control

```kotlin
var volume by remember {
    mutableFloatStateOf(50f)
}

NovaSlider(
    value = volume,
    onValueChange = {
        volume = it
    },
    valueRange = 0f..100f,
    modifier = Modifier.fillMaxWidth()
)
```

---

# 📱 Complete Dashboard Example

Here is an example showing how all Nova components can work together inside a single Jetpack Compose screen.

```kotlin
@Composable
fun MainScreen() {

    var toggleIndex by remember {
        mutableIntStateOf(0)
    }

    var inputText by remember {
        mutableStateOf("")
    }

    var sliderValue by remember {
        mutableFloatStateOf(50f)
    }

    NovaBackground(
        position = GlowPosition.TOP_RIGHT
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            // Segmented Toggle
            NovaToggle(
                options = listOf(
                    "Day",
                    "Week",
                    "Month"
                ),
                selectedIndex = toggleIndex,
                onToggle = {
                    toggleIndex = it
                },
                modifier = Modifier.fillMaxWidth()
            )

            // Card Container
            NovaCard(
                modifier = Modifier.fillMaxWidth()
            ) {

                // Text Input
                NovaTextField(
                    value = inputText,
                    onValueChange = {
                        inputText = it
                    },
                    hint = "Search query...",
                    modifier = Modifier.fillMaxWidth()
                )

                // Slider
                NovaSlider(
                    value = sliderValue,
                    onValueChange = {
                        sliderValue = it
                    },
                    modifier = Modifier.padding(
                        vertical = 12.dp
                    )
                )

                // Action Button
                NovaButton(
                    text = "Apply Filters",
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        // Apply filters
                    }
                )
            }
        }
    }
}
```

---

# 🎨 Theme Support

Nova automatically adapts to your application's Light and Dark themes.

You can also explicitly control the theme when required:

```kotlin
NovaBackground(
    position = GlowPosition.CENTER,
    isDarkTheme = true
) {
    // Your UI
}
```

Or use the system theme:

```kotlin
NovaBackground(
    position = GlowPosition.TOP_RIGHT,
    isDarkTheme = isSystemInDarkTheme()
) {
    // Your UI
}
```

---

# 💡 Design Philosophy

Nova is designed around a few simple principles:

* **Minimal but expressive UI**
* **Reusable components**
* **Consistent visual language**
* **Smooth interactions**
* **Light and Dark theme support**
* **Modern Jetpack Compose APIs**
* **Developer-friendly customization**

The goal is to reduce repetitive UI code while maintaining a consistent and modern design across Android applications.

---

# 🧩 Example Structure

A typical screen using Nova can follow this structure:

```text
NovaBackground
│
├── NovaToggle
│
├── NovaCard
│   │
│   ├── NovaTextField
│   │
│   ├── NovaSlider
│   │
│   └── NovaButton
│
└── Additional Nova Components
```

---

# ⚙️ Requirements

Make sure your project uses:

* Kotlin
* Jetpack Compose
* Material 3

Example dependencies:

```kotlin
dependencies {

    implementation(platform(
        "androidx.compose:compose-bom:<version>"
    ))

    implementation(
        "androidx.compose.ui:ui"
    )

    implementation(
        "androidx.compose.material3:material3"
    )

    implementation(
        "androidx.compose.ui:ui-tooling-preview"
    )
}
```

---

# 🗺️ Future Plans

Nova is designed to grow into a larger Jetpack Compose design system.

Planned components may include:

* [ ] Nova Dialog
* [ ] Nova Bottom Sheet
* [ ] Nova Navigation Components
* [ ] Nova Graphs and Charts
* [ ] Nova Loading Components
* [ ] Nova Snackbar
* [ ] Nova Dropdown
* [ ] Nova Date Picker
* [ ] Nova Animation Utilities
* [ ] Additional Ambient Effects
* [ ] Advanced Theme Customization

---

# 🤝 Contributing

Contributions, ideas, improvements, and feature suggestions are welcome.

If you find a bug or have an idea for a new component:

1. Fork the repository.
2. Create a new branch.
3. Add your changes.
4. Submit a pull request.

---

# 📄 License

This project is open for personal and development use.

You can customize this section with your preferred license, such as:

* MIT License
* Apache License 2.0
* GPL License

---

# 🌌 Nova

**Nova** is a modern Jetpack Compose design system focused on building visually consistent Android applications with reusable, theme-adaptive UI components.

Built with **Kotlin** and **Jetpack Compose**.
