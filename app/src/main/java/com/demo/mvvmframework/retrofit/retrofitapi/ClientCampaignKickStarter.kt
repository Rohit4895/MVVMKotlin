package com.demo.mvvmframework.retrofit.retrofitapi

import com.clevertrap.basicsetupkotlin.retrofit.UrlConstants
import com.demo.mvvmframework.retrofit.retrofitrequests.campaignkickstarters.ResponseCampaignkickStarter
import retrofit2.Call
import retrofit2.http.GET

interface ClientCampaignKickStarter {

    @GET(UrlConstants.GET_KICKSTARTER)
    fun getCampaigns():Call<List<ResponseCampaignkickStarter>>
}