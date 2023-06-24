package com.rajnish.firstcompose.model


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rajnish.firstcompose.db.User

class MyModel : ViewModel() {



    val user = MutableLiveData<User>()

    fun setUser(firstName: String, lastName: String, email: String, password: String) {
        user.value = User(firstName, lastName, email, password)
    }

}