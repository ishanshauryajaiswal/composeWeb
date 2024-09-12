package com.stevdza.san.models

import com.stevdza.san.util.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String,
    val url: String,
) {
    One(
        image = Res.Image.portfolio1,
        title = "Phonepe",
        description = "Android",
        url = "https://phonepe.com"
    ),
    Two(
        image = Res.Image.portfolio2,
        title = "Paytm",
        description = "Android",
        url = "https://paytm.com"
    ),
    Three(
        image = Res.Image.portfolio3,
        title = "Slice",
        description = "Android",
        url = "https://sliceit.com"
    ),
}