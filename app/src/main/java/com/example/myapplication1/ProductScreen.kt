package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class ProductScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Status bar visible and white
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)

        setContentView(R.layout.product_screen)

        val backArrow = findViewById<ImageView>(R.id.back_arrow)
        backArrow.setOnClickListener {
            finish()
        }

        // Bottom nav wiring
        findViewById<LinearLayout>(R.id.home_tab)?.setOnClickListener {
            startActivity(Intent(this, HomeScreen::class.java))
            finish()
        }

        findViewById<LinearLayout>(R.id.medical_bag_tab)?.setOnClickListener {
            // Already on product screen, no action needed
        }

        findViewById<LinearLayout>(R.id.prescription_tab)?.setOnClickListener {
            startActivity(Intent(this, PrescriptionScreen::class.java))
        }

        findViewById<LinearLayout>(R.id.cart_tab)?.setOnClickListener {
            startActivity(Intent(this, CheckoutScreen::class.java))
        }

        findViewById<LinearLayout>(R.id.profile_tab)?.setOnClickListener {
            startActivity(Intent(this, ProfileScreen::class.java))
        }

        // Upload prescription button
        findViewById<View>(R.id.upload_prescription_btn)?.setOnClickListener {
            startActivity(Intent(this, PrescriptionScreen::class.java))
        }
        
        // Set up cart icon click listeners for all product cards
        setupCartIconClickListeners()
    }
    
    private fun setupCartIconClickListeners() {
        // Find all cart icons in the product cards and set click listeners
        // Since we have multiple cart icons, we'll need to find them by their parent containers
        
        // For the first product card (Vitamin C Serum)
        val firstProductCard = findViewById<View>(R.id.first_product_card)
        firstProductCard?.findViewById<ImageView>(R.id.cart_icon_1)?.setOnClickListener {
            startActivity(Intent(this, CheckoutScreen::class.java))
        }
        
        // For the second product card (CeraVe SA Cleanser)
        val secondProductCard = findViewById<View>(R.id.second_product_card)
        secondProductCard?.findViewById<ImageView>(R.id.cart_icon_2)?.setOnClickListener {
            startActivity(Intent(this, CheckoutScreen::class.java))
        }
        
        // For the third product card (Vitamin D3 Gummies)
        val thirdProductCard = findViewById<View>(R.id.third_product_card)
        thirdProductCard?.findViewById<ImageView>(R.id.cart_icon_3)?.setOnClickListener {
            startActivity(Intent(this, CheckoutScreen::class.java))
        }
        
        // For the fourth product card (Centrum MultiGummies)
        val fourthProductCard = findViewById<View>(R.id.fourth_product_card)
        fourthProductCard?.findViewById<ImageView>(R.id.cart_icon_4)?.setOnClickListener {
            startActivity(Intent(this, CheckoutScreen::class.java))
        }
        
        // For the fifth product card (Omega-3 Fish Oil)
        val fifthProductCard = findViewById<View>(R.id.fifth_product_card)
        fifthProductCard?.findViewById<ImageView>(R.id.cart_icon_5)?.setOnClickListener {
            startActivity(Intent(this, CheckoutScreen::class.java))
        }
        
        // For the sixth product card (Protein Powder)
        val sixthProductCard = findViewById<View>(R.id.sixth_product_card)
        sixthProductCard?.findViewById<ImageView>(R.id.cart_icon_6)?.setOnClickListener {
            startActivity(Intent(this, CheckoutScreen::class.java))
        }
    }
}
