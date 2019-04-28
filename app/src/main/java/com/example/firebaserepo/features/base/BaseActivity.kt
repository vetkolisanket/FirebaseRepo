package com.example.firebaserepo.features.base

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by Sanket on 28/04/19.
 */
@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity(), IBaseContract.View {
    override fun getContext(): Context {
        return this
    }

    override fun showMessage(message: String, type: String) {
        toast(message)
    }

    fun toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }


}