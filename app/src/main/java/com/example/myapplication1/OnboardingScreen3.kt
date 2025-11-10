package com.example.myapplication1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class OnboardingScreen3 : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        
        setContentView(R.layout.onboarding_screen_3)
        
        // Find the get start button and back arrow
        val getStartButton = findViewById<Button>(R.id.get_started_button)
        val backArrow = findViewById<ImageView>(R.id.back_arrow)
        
        // Set click listener for get start button
        getStartButton.setOnClickListener {
            // Navigate to WelcomeScreen
            val intent = Intent(this, WelcomeScreen::class.java)
            startActivity(intent)
            finish()
        }
        
        // Set click listener for back arrow
        backArrow.setOnClickListener {
            // Go back to OnboardingScreen2
            val intent = Intent(this, OnboardingScreen2::class.java)
            startActivity(intent)
            finish()
        }
    }
}
