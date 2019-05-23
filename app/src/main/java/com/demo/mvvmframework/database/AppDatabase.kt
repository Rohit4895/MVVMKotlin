package com.demo.mvvmframework.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.demo.mvvmframework.database.dao.DAOCampaign
import com.demo.sampleappchallenge.database.dao.databasemodels.Campaign

@Database(entities = arrayOf(Campaign::class), version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun campaignDao(): DAOCampaign


    companion object {
        private var INSTANCE: AppDatabase?=null

        fun getInstance(context: Context): AppDatabase {

            return INSTANCE ?: synchronized(this){

                INSTANCE
                    ?: buildDatabase(context).also { INSTANCE = it }


            }

        }

        private fun buildDatabase(context: Context): AppDatabase {

            return Room.databaseBuilder(context, AppDatabase::class.java, "DATABASE").build()
        }

    }
}