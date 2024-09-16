package com.shaurya.me.models

import com.shaurya.me.util.Res

enum class Freelance(
    val image: String,
    val title: String,
    val description: String,
    val url: String,
) {
    One(
        image = Res.Image.gig3,
        title = "Cheap Hotels",
        description = "Android",
        url = "https://play.google.com/store/apps/details?id=us.cheaphotelsbooking.app",
    ),
    Two(
        image = Res.Image.gig2,
        title = "No Broker",
        description = "Android",
        url = "https://play.google.com/store/apps/details?id=com.nobroker.app&pcampaignid=web_share"
    ),
    Three(
        image = Res.Image.gig1,
        title = "TravelStart",
        description = "Android",
        url = "https://play.google.com/store/apps/details?id=za.co.travelstart.flapp",
    ),
    Four(
        image = Res.Image.gig4,
        title = "Nutra Check",
        description = "Android",
        url = "https://play.google.com/store/apps/details?id=com.nutratech.app.android&pcampaignid=web_share"
    ),
}