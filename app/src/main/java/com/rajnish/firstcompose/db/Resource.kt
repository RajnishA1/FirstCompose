package com.rajnish.firstcompose.db

sealed class Resource<out R> {
    data class Sucess<out R>(val result: R): Resource<R>()
    data class Failure<out R>(val result: R): Resource<Nothing>()
    data class Loading<out R>(val result: R): Resource<Nothing>()
}