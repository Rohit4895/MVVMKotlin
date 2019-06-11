package com.demo.mvvmframework.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.demo.mvvmframework.localrepository.LocalRepoCampaign
import com.demo.mvvmframework.remoterepository.RemoteRepoCampaigns
import com.demo.mvvmframework.database.AppDatabase
import com.demo.mvvmframework.retrofit.ErrorMessage
import com.demo.mvvmframework.retrofit.RetrofitCallback
import com.demo.mvvmframework.retrofit.retrofitrequestsresponse.campaignkickstarters.ResponseCampaignkickStarter

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