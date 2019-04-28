package com.example.firebaserepo.features.login

import com.example.firebaserepo.features.base.IBaseContract

/**
 * Created by Sanket on 28/04/19.
 */
interface ILoginContract {

    interface View: IBaseContract.View {

        fun onLoginSuccess()      //should be named something more specific like goToMainActivity() but since this is just a demo app I am not actually delegating to any activity as such

    }

    interface Presenter: IBaseContract.Presenter<View> {

        fun login(type: String)

    }

}