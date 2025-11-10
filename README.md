# MediCare App - Launch Screen

This Android application features a clean, modern launch screen with the MediCare logo, elegant animations, and smooth transitions to onboarding screens.

## Features

### Launch Screen with Loading
- **Centered MediCare Logo**: Displays the official app logo with smooth scale and fade-in animations
- **Loading Indicator**: Three animated dots below the logo with sequential pulsing animation
- **Clean White Background**: Professional white background with subtle brand color accents
- **Brand Elements**: "MediCare" app name with "Your Health, Our Priority" tagline
- **Smooth Transitions**: 3-second duration with elegant animations leading to onboarding screens

### Design Elements
- **Color Scheme**: Clean white background (#FFFFFF) with teal brand colors (#00BCD4)
- **Typography**: Serif font for app name, sans-serif for tagline and loading text
- **Animations**: Multiple animation types including scale, fade, and sequential dot animations
- **Responsive Layout**: ConstraintLayout-based design that adapts to different screen sizes
- **Decorative Elements**: Subtle corner circles for visual interest

## Technical Implementation

### Activities
- `SplashActivity`: Main launch screen with logo animations and loading indicators
- `MainActivity`: Welcome screen displayed after launch screen completes

### Animations
- **Logo Animation**: Scale from 0.5x to 1.0x with fade-in effect
- **Text Animation**: Sequential fade-in for app name and tagline
- **Loading Dots**: Sequential pulsing animation with staggered timing
- **Progress Bar**: Smooth fill animation from left to right

### Files Created/Modified
- `activity_splash.xml` - Launch screen layout
- `SplashActivity.kt` - Launch screen logic and animations
- `corner_circle.xml` - Decorative background element
- `loading_dot_active.xml` - Active loading dot drawable
- `loading_dot_inactive.xml` - Inactive loading dot drawable
- `colors.xml` - Brand color definitions
- `strings.xml` - App name and tagline
- `themes.xml` - Clean white theme
- `AndroidManifest.xml` - Activity configuration

## How to Run

1. Open the project in Android Studio
2. Sync Gradle files
3. Build and run the application
4. The launch screen will automatically display for 3 seconds
5. After completion, the welcome screen will appear

## Customization

### Colors
- Modify brand colors in `app/src/main/res/values/colors.xml`
- Update theme colors in `themes.xml`

### Timing
- Adjust launch screen duration in `SplashActivity.kt` (currently 3000ms)
- Modify animation delays and durations

### Animations
- Customize animation parameters in `SplashActivity.kt`
- Adjust loading dots timing and effects

## Requirements

- Android API Level 24+ (Android 7.0)
- Kotlin support
- AndroidX libraries
- ConstraintLayout support

## Dependencies

The project uses standard Android dependencies:
- `androidx.core:core-ktx`
- `androidx.appcompat:appcompat`
- `com.google.android.material:material`
- `androidx.constraintlayout:constraintlayout`
