package com.stevdza.san.models

import com.stevdza.san.util.Constants.LOREM_IPSUM_LONG

enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: String,
    val company: String,
    val from: String,
    val to: String
) {
    First(
        number = "01",
        jobPosition = "SDE 3 - Android",
        description = """
            Leading the development of EPIC, a lending product enabling micro transactions for online purchases.
            Building the Android app and backend using Firebase Cloud Functions, while integrating payment gateways for seamless transactions.
            Collaborating with the app platform team to develop central frameworks aimed at optimizing the existing app's performance and streamlining developer productivity.
        """.trimIndent(),
        company = "Slice",
        from = "March 2023",
        to = "Present"
    ),
    Second(
        number = "02",
        jobPosition = "Senior Android Developer",
        description = """
            Worked in multiple pods at PhonePe, implementing new features and flows for customers to enable new business use cases.
            Developed scalable frameworks like Hurdles, Consent, and Yatra, which were externalized as libraries and integrated with sister apps.
            Created a central permission framework managing Android runtime permissions. Reduced code redundancy by 13% and shrunk APK size by 5%.
            Mentored junior developers and participated in hiring mobile developers.
        """.trimIndent(),
        company = "PhonePe",
        from = "February 2020",
        to = "January 2023"
    ),
    Third(
        number = "03",
        jobPosition = "Android Developer",
        description = """
            Worked in the Movies and Events module of the Paytm app, implementing new features and flows.
            Led the development of the Merchant-Listing module from scratch, collaborating with backend, product, and design teams.
            Modularized the Movies and Merchant-Listing modules to enable dynamic delivery and improve app size and build time.
        """.trimIndent(),
        company = "Paytm",
        from = "September 2018",
        to = "February 2020"
    ),
    Fourth(
        number = "04",
        jobPosition = "Android Developer",
        description = """
            Collaborated with multiple teams to build native mobile applications that provided solutions to business problems.
            Developed and maintained various features within the company's mobile apps.
        """.trimIndent(),
        company = "Newgen Software",
        from = "January 2017",
        to = "September 2018"
    )
}
