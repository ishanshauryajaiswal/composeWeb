package com.shaurya.me.sections

import androidx.compose.runtime.Composable
import com.shaurya.me.models.Theme
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text


@Composable
fun TechStackSection() {
    val breakpoint = rememberBreakpoint()
    val horizontalPadding = if (breakpoint >= Breakpoint.MD) 96.px else 16.px
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        H2(
            attrs = Modifier
                .margin(bottom = 16.px)
                .toAttrs()
        ) {
            Text("Tech Stack")
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(right = horizontalPadding, left = horizontalPadding)
                .display(DisplayStyle.Flex)
                .flexWrap(FlexWrap.Wrap)
                .justifyContent(JustifyContent.Center)
        ) {
            val skills = listOf(
                "Kotlin", "Android", "iOS", "Compose", "Retrofit", "OkHttp", "Gradle",
                "Java", "VCS-Git", "Design Patterns", "SQLite", "MVVM", "MVP", "TDD",
                "Mockito", "HLD", "Android Architecture Components", "Glide",
                "Data Binding", "Modularization", "gpt ;)", "JUnit"
            )

            skills.forEach { skill ->
                Span(
                    attrs = Modifier
                        .margin(4.px)
                        .padding(8.px, 24.px)
                        .backgroundColor(Color.white)
                        .border(1.px, LineStyle.Solid, Theme.CustomBlackWithOpacity.rgb)
                        .border(1.px, LineStyle.Solid, Color.lightseagreen)
                        .boxShadow(offsetX = 0.px, offsetY = 2.px, blurRadius = 4.px, color = Theme.CustomBlackWithAlpha.rgb)
                        .borderRadius(20.px)
                        .toAttrs()
                ) {
                    Text(skill)
                }
            }
        }
    }
}
