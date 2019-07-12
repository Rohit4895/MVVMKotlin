package com.demo.mvvmframework.repository.localrepository

interface LocalRepoCallback<T> {
    fun dataCallback(data: T)
}