package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class HomeScreen : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color and prevent purple
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.white)
        
        // Ensure light status bar (dark icons on light background)
        window.decorView.systemUiVisibility = window.decorView.systemUiVisibility or 
            View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
        
        setContentView(R.layout.home_screen)
        
        // Initialize views
        val orderNowButton = findViewById<Button>(R.id.order_now_button)
        val bookNowButton = findViewById<Button>(R.id.book_now_button)
        val viewAllLink = findViewById<TextView>(R.id.view_all_link)
        val searchInput = findViewById<EditText>(R.id.search_input)
        val profilePicture = findViewById<ImageView>(R.id.profile_picture)
        
        // Category views
        val painKillerCategory = findViewById<LinearLayout>(R.id.pain_killer_category)
        val skinCareCategory = findViewById<LinearLayout>(R.id.skin_care_category)
        val supplementCategory = findViewById<LinearLayout>(R.id.supplement_category)
        
        // Bottom navigation views
        val homeTab = findViewById<LinearLayout>(R.id.home_tab)
        val medicalBagTab = findViewById<LinearLayout>(R.id.medical_bag_tab)
        val prescriptionTab = findViewById<LinearLayout>(R.id.prescription_tab)
        val cartTab = findViewById<LinearLayout>(R.id.cart_tab)
        val profileTab = findViewById<LinearLayout>(R.id.profile_tab)
        
        // Set click listeners for action buttons
        orderNowButton.setOnClickListener {
            Log.d("HomeScreen", "Order now button clicked")
            startActivity(Intent(this, ProductScreen::class.java))
        }
        
        // Set click listener for profile picture
        profilePicture.setOnClickListener {
            Log.d("HomeScreen", "Profile picture clicked")
            startActivity(Intent(this, ProfileScreen::class.java))
        }
        
        // Book Now button - Show message (AppointmentScreen removed)
        if (bookNowButton != null) {
            Log.d("HomeScreen", "Book now button found and initialized")
            Log.d("HomeScreen", "Book now button ID: ${bookNowButton.id}")
            Log.d("HomeScreen", "Book now button text: ${bookNowButton.text}")
            Log.d("HomeScreen", "Book now button is clickable: ${bookNowButton.isClickable}")
            Log.d("HomeScreen", "Book now button is enabled: ${bookNowButton.isEnabled}")
            
            bookNowButton.setOnClickListener {
                Log.d("HomeScreen", "Book now button clicked - AppointmentScreen removed")
            }
        } else {
            Log.e("HomeScreen", "Book now button is null! Check the layout file.")
        }
        
        viewAllLink.setOnClickListener {
            Log.d("HomeScreen", "View all link clicked")
            startActivity(Intent(this, ProductScreen::class.java))
        }
        
        // Set click listeners for category items
        painKillerCategory.setOnClickListener {
            Log.d("HomeScreen", "Pain killer category clicked")
            // TODO: Navigate to pain killer products
            // For now, just log the action
        }
        
        skinCareCategory.setOnClickListener {
            Log.d("HomeScreen", "Skin care category clicked")
            // TODO: Navigate to skin care products
            // For now, just log the action
        }
        
        supplementCategory.setOnClickListener {
            Log.d("HomeScreen", "Supplement category clicked")
            // TODO: Navigate to supplement products
            // For now, just log the action
        }
        
        // Set click listeners for bottom navigation
        homeTab.setOnClickListener {
            Log.d("HomeScreen", "Home tab clicked")
            // Already on home screen, no action needed
        }
        
        medicalBagTab.setOnClickListener {
            Log.d("HomeScreen", "Medical bag tab clicked")
            startActivity(Intent(this, ProductScreen::class.java))
        }
        
        prescriptionTab.setOnClickListener {
            Log.d("HomeScreen", "Prescription tab clicked")
            startActivity(Intent(this, PrescriptionScreen::class.java))
        }
        
        cartTab.setOnClickListener {
            Log.d("HomeScreen", "Cart tab clicked")
            startActivity(Intent(this, CheckoutScreen::class.java))
        }
        
        profileTab.setOnClickListener {
            Log.d("HomeScreen", "Profile tab clicked")
            startActivity(Intent(this, ProfileScreen::class.java))
        }
        
        // Handle search functionality
        searchInput?.setOnEditorActionListener { _, _, _ ->
            val searchQuery = searchInput.text.toString()
            if (searchQuery.isNotEmpty()) {
                Log.d("HomeScreen", "Search query: $searchQuery")
                // TODO: Implement search functionality
                // For now, just log the search query
            }
            true
        }
    }
}
