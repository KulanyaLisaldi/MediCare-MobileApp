package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class ProfileScreen : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        
        setContentView(R.layout.profile_screen)
        
        // Initialize views using correct IDs from layout
        val editProfileOption = findViewById<LinearLayout>(R.id.edit_profile_option)
        val orderHistoryOption = findViewById<LinearLayout>(R.id.order_history_option)
        val logoutOption = findViewById<LinearLayout>(R.id.logout_option)
        val backArrow = findViewById<ImageView>(R.id.back_arrow)
        val notificationBell = findViewById<ImageView>(R.id.notification_bell)
        
        // Set click listener for edit profile option
        editProfileOption.setOnClickListener {
            Log.d("ProfileScreen", "Edit profile option clicked")
            startActivity(Intent(this, EditProfileScreen::class.java))
        }
        
        // Set click listener for order history option
        orderHistoryOption.setOnClickListener {
            Log.d("ProfileScreen", "Order history option clicked")
            startActivity(Intent(this, OrderHistoryScreen::class.java))
            finish()
        }
        
        // Set click listener for logout option
        logoutOption.setOnClickListener {
            Log.d("ProfileScreen", "Logout option clicked")
            // Navigate to SignInScreen and clear activity stack
            val intent = Intent(this, SignInScreen::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
        
        // Set click listener for back arrow
        backArrow.setOnClickListener {
            Log.d("ProfileScreen", "Back arrow clicked")
            finish()
        }
        
        // Set click listener for notification bell
        notificationBell.setOnClickListener {
            Log.d("ProfileScreen", "Notification bell clicked")
            // TODO: Implement notifications functionality
            // For now, just log the action
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
            startActivity(Intent(this, CheckoutScreen::class.java))
            finish()
        }
        
        findViewById<LinearLayout>(R.id.profile_tab)?.setOnClickListener {
            // Already on profile screen, no action needed
        }
    }
}
