package com.demo.sampleappchallenge.database.dao.databasemodels

import androidx.room.ColumnInfo

class Campaign {

    /*

    "s.no":90,
      "amt.pledged":198896,
      "blurb":"Your alarm clock is now a personal assistant. By learning about your agenda and hobbies, Bonjour helps make the most of each day.",
      "by":"BONJOUR",
      "country":"US",
      "currency":"usd",
      "end.time":"2016-12-05T10:59:46-05:00",
      "location":"Los Angeles, CA",
      "percentage.funded":397,
      "num.backers":"15998",
      "state":"CA",
      "title":"Bonjour | Smart Alarm Clock with Artificial Intelligence",
      "type":"Town",
      "url":"/projects/1450781303/bonjour-smart-alarm-clock-with-artificial-intellig?ref=discovery"

    * */


    var serionNumber:Int? = null
    var amountPledged:Long? = null
    var blurb: String? = null
    var by: String?=null
    var country: String?=null
    var currency: String?=null
    var endTime: Long?=null
    var location: String?=null
    var percentageFunded: Int?=null
    var backersCount: Int?=null
    var state: String?=null
    var title: String?=null
    var type: String?=null
    var url: String?=null

}