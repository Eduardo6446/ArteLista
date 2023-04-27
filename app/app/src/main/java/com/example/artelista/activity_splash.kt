package com.example.artelista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.artelista.databinding.ActivitySplashBinding

class activity_splash : AppCompatActivity() {
    //
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        try
        {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash)
            //
            binding = ActivitySplashBinding.inflate(layoutInflater)
            val view= binding.root
            setContentView(view)

            //Agregamos la referencia al Imageview
            val LogoApp:ImageView = binding.imgArteLista
            val AnimLogo:Animation = AnimationUtils.loadAnimation(this, R.anim.anim1)
            LogoApp.startAnimation(AnimLogo)

            //Intent para crear instancia de la activity Login
            //val intent = Intent(this, activity_Login::class.java)
            val intent = Intent(this, activity_Login::class.java)

            AnimLogo.setAnimationListener(object: Animation.AnimationListener{
                override fun onAnimationStart(animation: Animation?) {
                }

                override fun onAnimationEnd(animation: Animation?) {
                    startActivity(intent)
                    finish()

                }

                override fun onAnimationRepeat(animation: Animation?) {
                }
            })

        }
        catch (e:java.lang.Exception){
            e.printStackTrace() }

    }
}