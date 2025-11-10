package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class SignUpScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        
        setContentView(R.layout.sign_up_screen)

        // Find the views
        val signUpButton = findViewById<Button>(R.id.sign_up_button)
        val signInLink = findViewById<TextView>(R.id.sign_in_link)
        val backArrow = findViewById<ImageView>(R.id.back_arrow)

        // Set click listener for sign up button to navigate to SignInScreen
        signUpButton.setOnClickListener {
            val intent = Intent(this, SignInScreen::class.java)
            startActivity(intent)
            finish() // Close the SignUpScreen
        }

        // Set click listener to navigate to SignInScreen
        signInLink.setOnClickListener {
            val intent = Intent(this, SignInScreen::class.java)
            startActivity(intent)
            finish() // Close the SignUpScreen
        }
        
        // Set click listener for back arrow
        backArrow.setOnClickListener {
            // Navigate back to WelcomeScreen
            val intent = Intent(this, WelcomeScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}