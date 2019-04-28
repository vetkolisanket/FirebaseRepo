package com.example.firebaserepo.features.base

import android.content.Context

/**
 * Created by Sanket on 28/04/19.
 */
interface IBaseContract {

    interface View {

        fun getContext(): Context

        fun showMessage(message: String, type: String)

    }


    interface Presenter<V> {

        fun attachView(view: V)

        fun detachView()

    }

}