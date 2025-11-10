# Onboarding Images Setup

## Overview
This app now includes 3 onboarding screens with navigation between them. The screens are designed based on the provided image descriptions.

## Current Setup
- **OnboardingScreen1**: "Book Trusted Doctor Online" - Medical professionals in white lab coats
- **OnboardingScreen2**: "Order Medicine To Your Doorstep" - Pharmacist helping customer
- **OnboardingScreen3**: "Your Health, Simplified" - Customer receiving medicine

## Adding Real Images
To replace the placeholder images with real ones:

1. **Add your images to the drawable folder:**
   - `app/src/main/res/drawable/onboarding_1_image.png` (or .jpg)
   - `app/src/main/res/drawable/onboarding_2_image.png` (or .jpg)
   - `app/src/main/res/drawable/onboarding_3_image.png` (or .jpg)

2. **Remove the placeholder XML files:**
   - Delete `onboarding_1_image.xml`
   - Delete `onboarding_2_image.xml`
   - Delete `onboarding_3_image.xml`

3. **Image Recommendations:**
   - **Screen 1**: Three medical professionals (doctors/nurses) in white lab coats
   - **Screen 2**: Pharmacist and customer interaction at pharmacy counter
   - **Screen 3**: Customer receiving medicine from pharmacist

## Navigation Flow
- App launches → OnboardingScreen1
- Click "Next" → OnboardingScreen2
- Click "Next" → OnboardingScreen3
- Click "Get Start" → (You can add navigation to your main app here)

## Features
- ✅ 3 onboarding screens with proper navigation
- ✅ Progress indicators showing current step
- ✅ Back arrow navigation (ready for implementation)
- ✅ Modern card-based design
- ✅ Responsive layout
- ✅ String resources for easy localization
