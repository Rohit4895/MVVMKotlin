package com.demo.mvvmframework.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.demo.sampleappchallenge.database.dao.databasemodels.Campaign

@Dao
interface DAOCampaign {

    @Query("SELECT * FROM CAMPAIGN")
    fun getAll(): List<Campaign>
}