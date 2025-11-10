package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class PaymentScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        
        setContentView(R.layout.payment_screen)

        findViewById<ImageView>(R.id.back_arrow).setOnClickListener {
            startActivity(Intent(this, CheckoutScreen::class.java))
            finish()
        }

        findViewById<Button>(R.id.confirm_button).setOnClickListener {
            startActivity(Intent(this, PaymentSuccessScreen::class.java))
            finish()
        }
    }
}


