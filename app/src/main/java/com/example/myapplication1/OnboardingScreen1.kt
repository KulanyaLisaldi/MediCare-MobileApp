package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class OnboardingScreen1 : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        
        setContentView(R.layout.onboarding_screen_1)
        
        // Find the next button and back arrow
        val nextButton = findViewById<Button>(R.id.next_button)
        val backArrow = findViewById<ImageView>(R.id.back_arrow)
        
        // Debug logging
        if (nextButton == null) {
            Log.e("OnboardingScreen1", "Next button not found!")
        } else {
            Log.d("OnboardingScreen1", "Next button found successfully")
        }
        
        if (backArrow == null) {
            Log.e("OnboardingScreen1", "Back arrow not found!")
        } else {
            Log.d("OnboardingScreen1", "Back arrow found successfully")
        }
        
        // Set click listener for next button
        nextButton?.setOnClickListener {
            Log.d("OnboardingScreen1", "Next button clicked!")
            // Navigate to OnboardingScreen2
            val intent = Intent(this, OnboardingScreen2::class.java)
            startActivity(intent)
            finish() // Close this activity
        }
        
        // Set click listener for back arrow
        backArrow?.setOnClickListener {
            Log.d("OnboardingScreen1", "Back arrow clicked!")
            // Navigate back to LaunchScreen
            val intent = Intent(this, LaunchScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}
