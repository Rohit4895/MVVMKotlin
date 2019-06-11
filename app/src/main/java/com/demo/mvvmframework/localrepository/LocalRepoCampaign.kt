package com.demo.mvvmframework.localrepository

import android.app.Application
import com.demo.mvvmframework.utils.AppExecutor
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