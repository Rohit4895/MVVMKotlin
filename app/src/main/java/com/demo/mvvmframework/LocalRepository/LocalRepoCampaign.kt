package com.demo.mvvmframework.LocalRepository

import android.app.Application
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.demo.mvvmframework.Utils.AppExecutor
import com.demo.mvvmframework.database.AppDatabase
import com.demo.sampleappchallenge.database.dao.databasemodels.Campaign

class LocalRepoCampaign {


    fun getCampagins(application: Application){



        AppExecutor.getSingleton().dbIO.execute{

            val list: List<Campaign> = AppDatabase.getInstance(application.applicationContext)
                .campaignDao()
                .getAll()

            AppExecutor.getSingleton().mainThread.execute{
             //callback to viewmodel using interface List<Campaign>
            }
        }


    }
}