package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class PrescriptionScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        
        setContentView(R.layout.prescription_screen)

        // Set up back arrow navigation
        val backArrow = findViewById<ImageView>(R.id.back_arrow)
        backArrow.setOnClickListener {
            finish()
        }

        // Set up checkout button
        val checkoutBtn = findViewById<View>(R.id.checkout_btn)
        checkoutBtn.setOnClickListener {
            // Navigate to checkout screen
            startActivity(Intent(this, CheckoutScreen::class.java))
        }

        // Set up bottom navigation
        findViewById<LinearLayout>(R.id.home_tab)?.setOnClickListener {
            startActivity(Intent(this, HomeScreen::class.java))
            finish()
        }

        findViewById<LinearLayout>(R.id.medical_bag_tab)?.setOnClickListener {
            startActivity(Intent(this, ProductScreen::class.java))
            finish()
        }

        findViewById<LinearLayout>(R.id.prescription_tab)?.setOnClickListener {
            // Already on prescription screen, no action needed
        }

        findViewById<LinearLayout>(R.id.cart_tab)?.setOnClickListener {
            startActivity(Intent(this, CheckoutScreen::class.java))
        }

        findViewById<LinearLayout>(R.id.profile_tab)?.setOnClickListener {
            startActivity(Intent(this, ProfileScreen::class.java))
        }
    }
}
