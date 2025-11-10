package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class OrderHistoryScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        
        setContentView(R.layout.order_history_screen)

        findViewById<ImageView>(R.id.back_arrow).setOnClickListener {
            startActivity(Intent(this, ProfileScreen::class.java))
            finish()
        }

        // Bottom nav wiring (same behavior as others)
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
            startActivity(Intent(this, CheckoutScreen::class.java))
            finish()
        }

        findViewById<LinearLayout>(R.id.profile_tab)?.setOnClickListener {
            startActivity(Intent(this, ProfileScreen::class.java))
            finish()
        }
    }
}


