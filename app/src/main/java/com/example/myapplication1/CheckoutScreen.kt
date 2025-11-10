package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class CheckoutScreen : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        
        setContentView(R.layout.checkout_screen)
        
        // Initialize views
        val backArrow = findViewById<ImageView>(R.id.back_arrow)
        val submitButton = findViewById<Button>(R.id.submit_button)
        
        // Set up back arrow navigation
        backArrow.setOnClickListener {
            finish()
        }
        
        // Set up submit button - no payment method selection required
        submitButton.setOnClickListener {
            Log.d("CheckoutScreen", "Submit button clicked - proceeding to payment")
            // Navigate directly to payment screen without payment method validation
            startActivity(Intent(this, PaymentScreen::class.java))
            finish()
        }
        
        // Set up bottom navigation
        setupBottomNavigation()
    }
    
    private fun setupBottomNavigation() {
        // Set up bottom navigation click listeners
        findViewById<LinearLayout>(R.id.home_tab)?.setOnClickListener {
            startActivity(Intent(this, HomeScreen::class.java))
            finish()
        }
        
        findViewById<LinearLayout>(R.id.medical_bag_tab)?.setOnClickListener {
            startActivity(Intent(this, ProductScreen::class.java))
            finish()
        }
        
        findViewById<LinearLayout>(R.id.prescription_tab)?.setOnClickListener {
            startActivity(Intent(this, PrescriptionScreen::class.java))
            finish()
        }
        
        findViewById<LinearLayout>(R.id.cart_tab)?.setOnClickListener {
            // Already on checkout screen, no action needed
        }
        
        findViewById<LinearLayout>(R.id.profile_tab)?.setOnClickListener {
            startActivity(Intent(this, ProfileScreen::class.java))
        }
    }
}
