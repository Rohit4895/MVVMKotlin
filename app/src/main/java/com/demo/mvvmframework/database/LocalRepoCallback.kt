package com.demo.mvvmframework.database

interface LocalRepoCallback<T> {
    fun dataCallback(data: T)
}