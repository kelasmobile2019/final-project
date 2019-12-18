package com.study.vapinginfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Handler().postDelayed({
            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
            finish()
        }, 4000) // Delay untuk Splash
    }
}
