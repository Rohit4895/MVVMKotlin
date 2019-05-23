package com.demo.mvvmframework.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.demo.mvvmframework.LocalRepository.LocalRepoCampaign
import com.demo.mvvmframework.RemoteRepository.RemoteRepoCampaigns
import com.demo.mvvmframework.database.AppDatabase
import com.demo.mvvmframework.retrofit.ErrorMessage
import com.demo.mvvmframework.retrofit.RetrofitCallback
import com.demo.mvvmframework.retrofit.retrofitrequests.campaignkickstarters.ResponseCampaignkickStarter

class VMHomeActivity(application: Application) : AndroidViewModel(application) {

    fun fetchKickStarters(appDatabase: AppDatabase){

        //TODO: Fetch local database, if does not exist then fetch from remote

        LocalRepoCampaign().getCampagins(this.getApplication())

        //Remote Database
        RemoteRepoCampaigns().getCampaigns( object :
            RetrofitCallback<List<ResponseCampaignkickStarter>> {
            override fun onSuccess(response: List<ResponseCampaignkickStarter>) {

            }

            override fun onFail(error: ErrorMessage?) {

            }
        })

    }
}