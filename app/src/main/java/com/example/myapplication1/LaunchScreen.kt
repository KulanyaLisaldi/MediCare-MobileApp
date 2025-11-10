package com.example.myapplication1

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class LaunchScreen : AppCompatActivity() {
    
    private lateinit var logo: ImageView
    private lateinit var appName: TextView
    private lateinit var tagline: TextView
    private lateinit var dot1: View
    private lateinit var dot2: View
    private lateinit var dot3: View
    private lateinit var progressFill: View
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Configure status bar - make it visible with proper color and prevent purple
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.white)
        
        // Ensure light status bar (dark icons on light background)
        window.decorView.systemUiVisibility = window.decorView.systemUiVisibility or 
            View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
        
        WindowCompat.setDecorFitsSystemWindows(window, true)
        
        setContentView(R.layout.launch_screen)
        
        // Initialize views
        logo = findViewById(R.id.logo)
        appName = findViewById(R.id.app_name)
        tagline = findViewById(R.id.tagline)
        dot1 = findViewById(R.id.dot1)
        dot2 = findViewById(R.id.dot2)
        dot3 = findViewById(R.id.dot3)
        progressFill = findViewById(R.id.progress_fill)
        
        // Add click listener to skip animation
        findViewById<View>(android.R.id.content).setOnClickListener {
            val intent = Intent(this, OnboardingScreen1::class.java)
            startActivity(intent)
            finish()
        }
        
        // Start animations
        startLogoAnimation()
        startTextAnimation()
        startLoadingDotsAnimation()
        startProgressAnimation()
        
        // MainActivity removed - splash screen will stay active
        // You can add navigation to another activity here if needed
    }
    
    private fun startLogoAnimation() {
        // Logo scale and fade animation
        val scaleX = ObjectAnimator.ofFloat(logo, "scaleX", 0.5f, 1.0f)
        val scaleY = ObjectAnimator.ofFloat(logo, "scaleY", 0.5f, 1.0f)
        val alpha = ObjectAnimator.ofFloat(logo, "alpha", 0f, 1f)
        
        val logoAnimator = AnimatorSet()
        logoAnimator.playTogether(scaleX, scaleY, alpha)
        logoAnimator.duration = 1000
        logoAnimator.interpolator = AccelerateDecelerateInterpolator()
        logoAnimator.start()
    }
    
    private fun startTextAnimation() {
        // App name and tagline fade-in animation
        val appNameAlpha = ObjectAnimator.ofFloat(appName, "alpha", 0f, 1f)
        val taglineAlpha = ObjectAnimator.ofFloat(tagline, "alpha", 0f, 1f)
        
        appNameAlpha.duration = 800
        appNameAlpha.startDelay = 500
        appNameAlpha.start()
        
        taglineAlpha.duration = 800
        taglineAlpha.startDelay = 700
        taglineAlpha.start()
    }
    
    private fun startLoadingDotsAnimation() {
        // Animate loading dots sequentially
        val dot1Scale = ObjectAnimator.ofFloat(dot1, "scaleX", 1f, 1.3f, 1f)
        val dot1ScaleY = ObjectAnimator.ofFloat(dot1, "scaleY", 1f, 1.3f, 1f)
        
        val dot2Scale = ObjectAnimator.ofFloat(dot2, "scaleX", 1f, 1.3f, 1f)
        val dot2ScaleY = ObjectAnimator.ofFloat(dot2, "scaleY", 1f, 1.3f, 1f)
        
        val dot3Scale = ObjectAnimator.ofFloat(dot3, "scaleX", 1f, 1.3f, 1f)
        val dot3ScaleY = ObjectAnimator.ofFloat(dot3, "scaleY", 1f, 1.3f, 1f)
        
        // Set repeat count on individual animators
        dot1Scale.repeatCount = android.animation.ValueAnimator.INFINITE
        dot1ScaleY.repeatCount = android.animation.ValueAnimator.INFINITE
        dot2Scale.repeatCount = android.animation.ValueAnimator.INFINITE
        dot2ScaleY.repeatCount = android.animation.ValueAnimator.INFINITE
        dot3Scale.repeatCount = android.animation.ValueAnimator.INFINITE
        dot3ScaleY.repeatCount = android.animation.ValueAnimator.INFINITE
        
        val dot1Anim = AnimatorSet()
        dot1Anim.playTogether(dot1Scale, dot1ScaleY)
        dot1Anim.duration = 600
        
        val dot2Anim = AnimatorSet()
        dot2Anim.playTogether(dot2Scale, dot2ScaleY)
        dot2Anim.duration = 600
        
        val dot3Anim = AnimatorSet()
        dot3Anim.playTogether(dot3Scale, dot3ScaleY)
        dot3Anim.duration = 600
        
        // Start dots animation with delays
        dot1Anim.start()
        dot2Anim.startDelay = 200
        dot2Anim.start()
        dot3Anim.startDelay = 400
        dot3Anim.start()
    }
    
    private fun startProgressAnimation() {
        // Progress bar fill animation
        val progressAnimator = android.animation.ValueAnimator.ofFloat(0f, 1f)
        progressAnimator.duration = 2500
        progressAnimator.startDelay = 1000
        progressAnimator.addUpdateListener { animator ->
            val progress = animator.animatedValue as Float
            progressFill.scaleX = progress
        }
        progressAnimator.addListener(object : android.animation.Animator.AnimatorListener {
            override fun onAnimationStart(animation: android.animation.Animator) {}
            override fun onAnimationEnd(animation: android.animation.Animator) {
                // Navigate to OnboardingScreen1 when animation completes
                val intent = Intent(this@LaunchScreen, OnboardingScreen1::class.java)
                startActivity(intent)
                finish()
            }
            override fun onAnimationCancel(animation: android.animation.Animator) {}
            override fun onAnimationRepeat(animation: android.animation.Animator) {}
        })
        progressAnimator.start()
    }
}
