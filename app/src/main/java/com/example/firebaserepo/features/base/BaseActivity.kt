package com.example.firebaserepo.features.base

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity

/**
 * Created by Sanket on 28/04/19.
 */
@SuppressLint("Registered")
class BaseActivity : AppCompatActivity(), IBaseContract.View {
    override fun getContext(): Context {
        return this
    }

    override fun showMessage(type: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}