package com.rajnish.firstcompose.db


import com.google.firebase.auth.FirebaseUser

interface  Repository {

   val currentUser : FirebaseUser?
   suspend fun login(email:String,password:String): Resource<FirebaseUser>
   suspend fun signup(name:String,email:String,password:String): Resource<FirebaseUser>

   fun logout()

}


