package com.rajnish.firstcompose.db

data class User (
    val name: String = "",
    val lastName: String = "",
    val email: String? = null,
    val password: String? = null
)
