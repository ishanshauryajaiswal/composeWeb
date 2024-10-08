package com.shaurya.me.models

enum class Section(
    val id: String,
    val title: String,
    val subtitle: String,
    val path: String,
    val shouldShow: Boolean = true,
) {
    Home(
        id = "home",
        title = "Home",
        subtitle = "",
        path = "#home"
    ),
    About(
        id = "about",
        title = "About me",
        subtitle = "Its all about keeping it clean & simple",
        path = "#about"
    ),
    Experience(
        id = "experience",
        title = "Experience",
        subtitle = "Work Experience",
        path = "#experience"
    ),
    Portfolio(
        id = "portfolio",
        title = "Apps",
        subtitle = "Apps I've worked on",
        path = "#portfolio",
    ),
    Contact(
        id = "contact",
        title = "Contact me",
        subtitle = "Get in Touch",
        path = "#contact"
    ),
    Service(
        id = "service",
        title = "Service",
        subtitle = "I'm Good at",
        path = "#service",
        shouldShow = false,
    ),
    Testimonial(
        id = "testimonial",
        title = "Testimonial",
        subtitle = "Happy Customers",
        path = "#testimonial",
        shouldShow = false
    ),
    Achievements(
        id = "achievements",
        title = "Achievements",
        subtitle = "Personal Achievements",
        path = "#achievements",
        shouldShow = false,
    )
}