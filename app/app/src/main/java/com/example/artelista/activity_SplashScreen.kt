package com.example.artelista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class activity_SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        try
        {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash)

            //Agregamos la referencia al Imageview
            val LogoApp:ImageView = findViewById(R.id.imgArteLista)
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