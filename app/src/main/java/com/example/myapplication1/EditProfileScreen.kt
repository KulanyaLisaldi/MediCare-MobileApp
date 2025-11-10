package com.example.myapplication1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class EditProfileScreen : AppCompatActivity() {

    private lateinit var profileImageView: ImageView
    private val pickImageLauncher = registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        if (uri != null) {
            profileImageView.setImageURI(uri)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        
        setContentView(R.layout.edit_profile_screen)

        profileImageView = findViewById(R.id.profile_picture)
        findViewById<ImageView>(R.id.btn_change_photo).setOnClickListener {
            pickImageLauncher.launch("image/*")
        }

        findViewById<ImageView>(R.id.back_arrow).setOnClickListener {
            Log.d("EditProfileScreen", "Back arrow clicked")
            startActivity(Intent(this, ProfileScreen::class.java))
            finish()
        }

        findViewById<LinearLayout>(R.id.save_button_container).setOnClickListener {
            Log.d("EditProfileScreen", "Save button clicked")
            // TODO persist changes if needed
            startActivity(Intent(this, ProfileScreen::class.java))
            finish()
        }
        findViewById<Button>(R.id.save_button).setOnClickListener {
            Log.d("EditProfileScreen", "Save button clicked")
            // TODO persist changes if needed
            startActivity(Intent(this, ProfileScreen::class.java))
            finish()
        }
    }
}


