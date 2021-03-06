package com.smarttoolfactory.composematerialslider.ui.theme.brush

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import com.smarttoolfactory.composematerialslider.ui.theme.*

fun goldGradient(): Brush {
    return Brush.linearGradient(colors = goldColors)
}

fun silverGradient(): Brush {
    return Brush.linearGradient(colors = silverColors2)
}

fun sugarGradient(): Brush {
    return Brush.linearGradient(
        listOf(
            Color.White,
            Color.Red,
            Color.White
        ),
        start = Offset.Zero,
        end = Offset(40f, 40f),
        tileMode = TileMode.Repeated
    )
}

fun sunsetGradient(): Brush {
    return Brush.linearGradient(colors = sunsetColors)
}

fun sunriseGradient(): Brush {
    return Brush.linearGradient(colors = sunriseColors)
}

fun instaGradient(): Brush {
    return Brush.linearGradient(colors = instaColors)
}
