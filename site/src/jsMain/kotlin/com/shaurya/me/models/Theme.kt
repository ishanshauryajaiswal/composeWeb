package com.shaurya.me.models

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.rgba

enum class Theme(
    val hex: String,
    val rgb: CSSColorValue
) {
    Primary(hex = "#00A78E", rgb = rgb(r = 0, g = 167, b = 142)),
    Secondary(hex = "#121D34", rgb = rgb(r = 18, g = 29, b = 52)),
    Gray(hex = "#CFCFCF", rgb = rgb(r = 207, g = 207, b = 207)),
    LightGray(hex = "#EDEDED", rgb = rgb(r = 237, g = 237, b = 237)),
    LighterGray(hex = "#F9F9F9", rgb = rgb(r = 249, g = 249, b = 249)),

    CustomGreen(hex = "#C8FFC8", rgb = rgb(r = 200, g = 255, b = 200)),
    CustomBlackWithOpacity(hex = "#1A000000", rgb = rgba(r = 0, g = 0, b = 0, a = 0.1)),
    CustomBlackWithAlpha(hex = "#1A000000", rgb = rgba(r = 0, g = 0, b = 0, a = 0.1)),
}