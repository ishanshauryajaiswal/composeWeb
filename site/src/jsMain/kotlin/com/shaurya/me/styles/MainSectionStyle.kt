package com.shaurya.me.styles

import com.shaurya.me.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.*
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto

val NavigationItemStyle = CssStyle {
    base {
        Modifier
            .styleModifier {
                property("--bs-link-color", Theme.Secondary.rgb)
            }
            .color(Theme.Secondary.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    hover {
        Modifier
            .styleModifier {
                property("--bs-link-hover-color", Theme.Primary.rgb)
            }
            .color(Theme.Primary.rgb)
    }
}

val LogoStyle = CssStyle {
    base {
        Modifier
            .width(20.vw)     // Set width to 20% of viewport width for responsiveness
            .maxWidth(200.px)
            .height(auto)
            .margin(leftRight = 16.px, topBottom = 8.px)
            .transform { rotate(0.deg) }
            .transition(CSSTransition(property = "transform", duration = 200.ms))
    }
    hover {
        Modifier
            .transform { rotate((-10).deg) }
    }
}



val SocialLinkStyle = CssStyle {
    base {
        Modifier
            .color(Theme.Gray.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    hover {
        Modifier.color(Theme.Primary.rgb)
    }
}

val MainButtonStyle = CssStyle {
    base {
        Modifier
            .width(100.px)
            .transition(CSSTransition(property = "width", duration = 200.ms))
    }
    hover {
        Modifier.width(120.px)
    }
}

@OptIn(ExperimentalComposeWebApi::class)
val MainImageStyle = CssStyle {
    base {
        Modifier
            .styleModifier {
                filter { grayscale(100.percent) }
            }
            .transition(CSSTransition(property = "filter", duration = 200.ms))
    }
    hover {
        Modifier.styleModifier {
            filter { grayscale(0.percent) }
        }
    }
}