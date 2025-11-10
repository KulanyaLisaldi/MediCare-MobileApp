package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class SignInScreen : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        
        setContentView(R.layout.sign_in_screen)
        
        // Initialize views
        val emailInput = findViewById<EditText>(R.id.email_input)
        val passwordInput = findViewById<EditText>(R.id.password_input)
        val forgotPasswordLink = findViewById<TextView>(R.id.forgot_password_link)
        val signInSubmitButton = findViewById<Button>(R.id.sign_in_submit_button)
        val backArrow = findViewById<ImageView>(R.id.back_arrow)
        val googleIcon = findViewById<ImageView>(R.id.google_icon_signin)
        val facebookIcon = findViewById<ImageView>(R.id.facebook_icon_signin)
        val appleIcon = findViewById<ImageView>(R.id.apple_icon_signin)
        
        // Set click listener for forgot password link
        forgotPasswordLink.setOnClickListener {
            Log.d("SignInScreen", "Forgot password link clicked")
            // TODO: Navigate to forgot password screen
            // For now, just log the action
        }
        
        // Set click listener for sign in submit button - Navigate immediately to HomeScreen
        signInSubmitButton.setOnClickListener {
            Log.d("SignInScreen", "Sign in submit button clicked")
            
            // Navigate to HomeScreen immediately - no validation required
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
            finish() // Close the sign in screen
        }
        
        // Set click listener for back arrow
        backArrow.setOnClickListener {
            Log.d("SignInScreen", "Back arrow clicked")
            // Navigate back to WelcomeScreen
            val intent = Intent(this, WelcomeScreen::class.java)
            startActivity(intent)
            finish()
        }
        
        // Set click listeners for social media icons
        googleIcon.setOnClickListener {
            Log.d("SignInScreen", "Google icon clicked")
            // TODO: Implement Google sign-in
            // For now, just log the action
        }
        
        facebookIcon.setOnClickListener {
            Log.d("SignInScreen", "Facebook icon clicked")
            // TODO: Implement Facebook sign-in
            // For now, just log the action
        }
        
        appleIcon.setOnClickListener {
            Log.d("SignInScreen", "Apple icon clicked")
            // TODO: Implement Apple sign-in
            // For now, just log the action
        }
        
        // Ensure input fields don't have any navigation listeners
        // They should only be for text input, not navigation
        emailInput.setOnEditorActionListener { _, _, _ ->
            false // Don't handle any editor actions
        }
        
        passwordInput.setOnEditorActionListener { _, _, _ ->
            false // Don't handle any editor actions
        }
    }
}
