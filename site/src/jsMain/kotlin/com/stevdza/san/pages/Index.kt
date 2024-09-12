package com.stevdza.san.pages

import androidx.compose.runtime.*
import com.stevdza.san.components.BackToTopButton
import com.stevdza.san.components.OverflowMenu
import com.stevdza.san.models.Section
import com.stevdza.san.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    var menuOpened by remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainSection(onMenuClicked = { menuOpened = true })
            AboutSection()
            ExperienceSection()
            ContactSection()
            if(Section.Service.shouldShow) {
                ServiceSection()
            }
            PortfolioSection()
            if(Section.Achievements.shouldShow) {
                AchievementsSection()
            }
            if(Section.Testimonial.shouldShow) {
                TestimonialSection()
            }
            FooterSection()
        }
        BackToTopButton()
        if (menuOpened) {
            OverflowMenu(onMenuClosed = { menuOpened = false })
        }
    }
}