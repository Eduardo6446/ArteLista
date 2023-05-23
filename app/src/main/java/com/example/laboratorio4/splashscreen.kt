package com.example.laboratorio4


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.laboratorio4.databinding.ActivitySplashscreenBinding
import java.lang.Exception

class splashscreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashscreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
       try {
           super.onCreate(savedInstanceState)
           binding= ActivitySplashscreenBinding.inflate(layoutInflater)
           val view = binding.root
           setContentView(view)

           val LogoApp:ImageView = binding.imgartelista
           val AnimLogo:Animation= AnimationUtils.loadAnimation(this, R.anim.anim1)
           LogoApp.startAnimation(AnimLogo)


           val intent = Intent(this, Login::class.java)
           AnimLogo.setAnimationListener(object: Animation.AnimationListener{
               override fun onAnimationStart(p0: Animation?) {
               }

               override fun onAnimationEnd(p0: Animation?) {
                   startActivity(intent)
                   finish()
               }

               override fun onAnimationRepeat(p0: Animation?) {
               }
           })
       }catch (e: Exception){
           e.printStackTrace()
       }

    }
}