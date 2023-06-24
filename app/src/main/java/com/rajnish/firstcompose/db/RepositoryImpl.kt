package com.rajnish.firstcompose.db

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class RepositoryImpl(
    private val firebaseAuth: FirebaseAuth
) : Repository {
    override val currentUser: FirebaseUser?
        get() = firebaseAuth.currentUser

    override suspend fun login(email: String, password: String): Resource<FirebaseUser> {
//      firebaseAuth.signInWithEmailAndPassword(email,password).adds
        return null!!
    }

    override suspend fun signup(
        name: String,
        email: String,
        password: String
    ): Resource<FirebaseUser> {
        TODO("Not yet implemented")
    }

    override fun logout() {
        TODO("Not yet implemented")
    }
}