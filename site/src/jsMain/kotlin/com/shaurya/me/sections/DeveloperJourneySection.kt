package com.shaurya.me.sections

import androidx.compose.runtime.*
import com.shaurya.me.components.SectionTitle
import com.shaurya.me.models.Section
import com.shaurya.me.models.Theme
import com.shaurya.me.styles.AboutTextStyle
import com.shaurya.me.util.Constants.FONT_FAMILY
import com.shaurya.me.util.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

val DevJourneyTextMaxWidth = 800.px

@Composable
fun DeveloperJourneySection() {
    Box(
        modifier = Modifier
            .id(Section.DeveloperJourney.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 80.px),
        contentAlignment = Alignment.Center
    ) {
        DeveloperJourneyContent()
    }
}

@Composable
fun DeveloperJourneyContent() {
    val breakpoint = rememberBreakpoint()

    val journeyTexts = listOf(
        "My journey into mobile app development began with a passion for creating seamless user experiences across both Android and iOS platforms. Early on, I was captivated by the power of cool features, fluid animations, and smooth transitions that make an app feel alive. My focus was on building intuitive and engaging interfaces, ensuring that users on both platforms felt a natural flow while navigating through the app.",
        "As I honed my skills, I transitioned into leading projects from the ground up. I began working closely with backend, design, and product teams to deliver new features that added real value to the app. My role evolved into not just developing, but also monitoring the impact of these features through key performance metrics and conducting A/B tests to fine-tune the user experience.",
        "With time, the scale of the apps I worked on grew significantly, eventually reaching a milestone of 100 million users. This shift required me to dive deeper into the platform side of things, where I gained experience working on core networking layers, modularization, dynamic delivery, and implementing advanced analytics frameworks. As I advanced into a senior developer role, I also had the opportunity to hire and build a small team, mentoring junior developers and guiding them as they grew in their careers.",
        "Today, with apps I've helped build scaling to over 500 million monthly active users (MAUs), I'm looking for new opportunities in the freelance world. As I plan to settle back in my native, I'm excited to collaborate with clients remotely and continue crafting exceptional mobile experiences.",
        "All in all, I’ve been fortunate to work on some truly exciting products and with companies that have scaled at an incredible pace. Along the way, I’ve had the privilege to collaborate with brilliant tech and product minds, learning a great deal from their expertise and insights. While I enjoy the craft of coding, I find that routine maintenance and business-as-usual tasks don’t quite spark the same enthusiasm. However, when it comes to building features and products I believe in, that’s when I’m at my best—pushing boundaries, finding creative solutions, and fully immersing myself in the process of turning ideas into impactful realities."
    )
    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            )
            .maxWidth(1200.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(section = Section.DeveloperJourney)

        // Iterate through the list of paragraphs
        journeyTexts.forEach { text ->
            P(
                attrs = AboutTextStyle.toModifier()
                    .margin(topBottom = 25.px)
                    .maxWidth(DevJourneyTextMaxWidth)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Normal)
                    .fontStyle(FontStyle.Italic)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text(text)
            }
        }
    }
}
