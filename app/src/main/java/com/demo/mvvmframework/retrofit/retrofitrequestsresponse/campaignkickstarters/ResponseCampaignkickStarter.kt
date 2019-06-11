package com.demo.mvvmframework.retrofit.retrofitrequestsresponse.campaignkickstarters

import com.google.gson.annotations.SerializedName

class ResponseCampaignkickStarter {

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

    @SerializedName("s.no")
    var serionNumber:Int? = null

    @SerializedName("amt.pledged")
    var amountPledged:Long? = null

    @SerializedName("blurb")
    var blurb: String? = null

    @SerializedName("by")
    var by: String?=null

    @SerializedName("country")
    var country: String?=null

    @SerializedName("currency")
    var currency: String?=null

    @SerializedName("end.time")
    var endTime: String?=null

    @SerializedName("location")
    var location: String?=null

    @SerializedName("percentage.funded")
    var percentageFunded: Int?=null

    @SerializedName("num.backers")
    var backers: String?=null

    @SerializedName("state")
    var state: String?=null

    @SerializedName("title")
    var title: String?=null

    @SerializedName("type")
    var type: String?=null

    @SerializedName("url")
    var url: String?=null


}