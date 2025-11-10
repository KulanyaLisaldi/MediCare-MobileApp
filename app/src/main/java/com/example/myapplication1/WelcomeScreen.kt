package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class WelcomeScreen : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color and prevent purple
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.white)
        
        // Ensure light status bar (dark icons on light background)
        window.decorView.systemUiVisibility = window.decorView.systemUiVisibility or 
            View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
        
        WindowCompat.setDecorFitsSystemWindows(window, true)
        
        setContentView(R.layout.welcome_screen)
        
        // Initialize views
        val signUpButton = findViewById<Button>(R.id.sign_up_button)
        val signInButton = findViewById<Button>(R.id.sign_in_button)
        val backArrow = findViewById<ImageView>(R.id.back_arrow)
        val googleIcon = findViewById<ImageView>(R.id.google_icon)
        val facebookIcon = findViewById<ImageView>(R.id.facebook_icon)
        val appleIcon = findViewById<ImageView>(R.id.apple_icon)
        
        // Set click listeners for main action buttons
        signUpButton.setOnClickListener {
            // Navigate to SignUpScreen
            val intent = Intent(this, SignUpScreen::class.java)
            startActivity(intent)
        }
        
        signInButton.setOnClickListener {
            Log.d("WelcomeScreen", "Sign in button clicked")
            // Navigate to SignInScreen
            val intent = Intent(this, SignInScreen::class.java)
            startActivity(intent)
        }
        
        // Set click listener for back arrow
        backArrow.setOnClickListener {
            Log.d("WelcomeScreen", "Back arrow clicked")
            // Navigate back to OnboardingScreen3
            val intent = Intent(this, OnboardingScreen3::class.java)
            startActivity(intent)
            finish()
        }
        
        // Set click listeners for social media icons
        googleIcon.setOnClickListener {
            Log.d("WelcomeScreen", "Google icon clicked")
            // TODO: Implement Google sign-in
            // For now, just log the action
        }
        
        facebookIcon.setOnClickListener {
            Log.d("WelcomeScreen", "Facebook icon clicked")
            // TODO: Implement Facebook sign-in
            // For now, just log the action
        }
        
        appleIcon.setOnClickListener {
            Log.d("WelcomeScreen", "Apple icon clicked")
            // TODO: Implement Apple sign-in
            // For now, just log the action
        }
    }
}
