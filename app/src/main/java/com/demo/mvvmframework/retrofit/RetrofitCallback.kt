package com.demo.mvvmframework.retrofit

interface RetrofitCallback<T>{
    fun onSuccess(response: T)
    fun onFail(error: ErrorMessage?)
}