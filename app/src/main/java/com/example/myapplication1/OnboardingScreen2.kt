package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class OnboardingScreen2 : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        
        setContentView(R.layout.onboarding_screen_2)
        
        // Find the next button and back arrow
        val nextButton = findViewById<Button>(R.id.next_button)
        val backArrow = findViewById<ImageView>(R.id.back_arrow)
        
        // Set click listener for next button
        nextButton.setOnClickListener {
            // Navigate to OnboardingScreen3
            val intent = Intent(this, OnboardingScreen3::class.java)
            startActivity(intent)
            finish() // Close this activity
        }
        
        // Set click listener for back arrow
        backArrow.setOnClickListener {
            // Go back to OnboardingScreen1
            val intent = Intent(this, OnboardingScreen1::class.java)
            startActivity(intent)
            finish()
        }
    }
}
