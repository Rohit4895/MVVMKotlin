package com.demo.mvvmframework.RemoteRepository

import com.clevertrap.basicsetupkotlin.retrofit.RestClient
import com.demo.mvvmframework.retrofit.RetrofitCallback
import com.demo.mvvmframework.retrofit.retrofitapi.ClientCampaignKickStarter
import com.demo.mvvmframework.retrofit.retrofitrequests.campaignkickstarters.ResponseCampaignkickStarter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteRepoCampaigns {


    fun getCampaigns(callBack: RetrofitCallback<List<ResponseCampaignkickStarter>>){

        var clientCampaign: ClientCampaignKickStarter = RestClient.createService(
            ClientCampaignKickStarter::class.java)

        clientCampaign.getCampaigns().enqueue(object : Callback<List<ResponseCampaignkickStarter>>{

            override fun onResponse(
                call: Call<List<ResponseCampaignkickStarter>>,
                response: Response<List<ResponseCampaignkickStarter>>
            ) {

                if(response.isSuccessful && response.body() != null){

                    callBack.onSuccess(response.body()!!)

                }else{

                    callBack.onFail(RestClient.errorConverter.convert(response.errorBody()!!))

                }
            }

            override fun onFailure(call: Call<List<ResponseCampaignkickStarter>>, t: Throwable) {


                var error = RestClient.defaultErrorMessage()
                error.message = t.localizedMessage
                callBack.onFail(error)
            }
        })

    }
}