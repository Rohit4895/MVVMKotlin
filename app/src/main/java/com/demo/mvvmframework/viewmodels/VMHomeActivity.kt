package com.demo.mvvmframework.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.demo.mvvmframework.localrepository.LocalRepoCampaign
import com.demo.mvvmframework.remoterepository.RemoteRepoCampaigns
import com.demo.mvvmframework.database.AppDatabase
import com.demo.mvvmframework.database.LocalRepoCallback
import com.demo.mvvmframework.retrofit.ErrorMessage
import com.demo.mvvmframework.retrofit.RetrofitCallback
import com.demo.mvvmframework.retrofit.retrofitrequestsresponse.campaignkickstarters.ResponseCampaignkickStarter
import com.demo.sampleappchallenge.database.dao.databasemodels.Campaign

class VMHomeActivity(application: Application) : AndroidViewModel(application) {

    val mutableLiveData: MutableLiveData<List<Campaign>> = MutableLiveData()
    val mutableLiveDataFromRemote: MutableLiveData<List<Campaign>> = MutableLiveData()

    fun fetchKickStarters(appDatabase: AppDatabase){

        //Remote Database
        RemoteRepoCampaigns().getCampaigns( object :
            RetrofitCallback<List<ResponseCampaignkickStarter>> {
            override fun onSuccess(response: List<ResponseCampaignkickStarter>) {

            }

            override fun onFail(error: ErrorMessage?) {

            }
        })

    }

    fun fetchFromDatabaseKickStarters(appDatabase: AppDatabase): MutableLiveData<List<Campaign>>{
        LocalRepoCampaign().getCampagins(this.getApplication(), object : LocalRepoCallback<List<Campaign>>{
            override fun dataCallback(data: List<Campaign>) {

                mutableLiveData.postValue(data)
            }
        })
        return mutableLiveData
    }
}