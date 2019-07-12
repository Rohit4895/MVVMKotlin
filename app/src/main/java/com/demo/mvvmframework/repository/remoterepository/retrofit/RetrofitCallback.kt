package com.demo.mvvmframework.repository.remoterepository.retrofit

interface RetrofitCallback<T>{
    fun onSuccess(response: T)
    fun onFail(error: ErrorMessage?)
}