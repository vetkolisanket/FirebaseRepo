package com.example.firebaserepo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.firebaserepo.features.login.LoginActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        btnLogin.setOnClickListener {
            startActivity(LoginActivity.newIntent(this@MainActivity))
        }
    }


}
