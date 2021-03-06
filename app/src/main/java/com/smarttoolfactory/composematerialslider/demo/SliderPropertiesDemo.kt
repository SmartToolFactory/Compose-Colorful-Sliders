package com.smarttoolfactory.composematerialslider.demo

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.smarttoolfactory.composematerialslider.ui.theme.*
import com.smarttoolfactory.slider.ColorfulSlider
import com.smarttoolfactory.slider.MaterialSliderDefaults
import com.smarttoolfactory.slider.SliderBrushColor

@Composable
fun SliderPropertiesDemo() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {

        TitleText("Slider Colors")
        var progress1 by remember { mutableStateOf(0f) }

        ColorfulSlider(
            value = progress1,
            onValueChange = { it ->
                progress1 = it
            },
            colors = MaterialSliderDefaults.materialColors(
                activeTrackColor = SliderBrushColor(color = Red400),
                thumbColor = SliderBrushColor(color = Red400),
                inactiveTrackColor = SliderBrushColor(color = Grey400)
            )
        )

        ColorfulSlider(
            value = progress1,
            onValueChange = { it ->
                progress1 = it
            },
            colors = MaterialSliderDefaults.materialColors(
                activeTrackColor = SliderBrushColor(color = Red400),
                inactiveTrackColor = SliderBrushColor(color = Green400),
                thumbColor = SliderBrushColor(color = Orange400),
            )
        )

        ColorfulSlider(
            enabled = false,
            value = progress1,
            onValueChange = { it ->
                progress1 = it
            },

            colors = MaterialSliderDefaults.materialColors(
                activeTrackColor = SliderBrushColor(color = Red400),
                thumbColor = SliderBrushColor(color = Red400),
                inactiveTrackColor = SliderBrushColor(color = Grey400)
            )
        )

        TitleText("Solid Border")
        var progress2 by remember { mutableStateOf(0f) }
        ColorfulSlider(
            value = progress2,
            thumbRadius = 10.dp,
            trackHeight = 12.dp,
            onValueChange = { value ->
                progress2 = value
            },
            colors = MaterialSliderDefaults.materialColors(
                activeTrackColor = SliderBrushColor(color = Color.Black),
                inactiveTrackColor = SliderBrushColor(color = Color.Transparent)
            ),
            borderStroke = BorderStroke(1.dp, Color.Black)
        )

        ColorfulSlider(
            value = progress2,
            thumbRadius = 12.dp,
            trackHeight = 14.dp,
            onValueChange = { value ->
                progress2 = value
            },
            colors = MaterialSliderDefaults.materialColors(
                activeTrackColor = SliderBrushColor(color = Red400),
                inactiveTrackColor = SliderBrushColor(color = Color.Transparent)
            ),
            borderStroke = BorderStroke(1.dp, Red400)
        )

        ColorfulSlider(
            value = progress2,
            thumbRadius = 16.dp,
            trackHeight = 16.dp,
            onValueChange = { value ->
                progress2 = value
            },
            colors = MaterialSliderDefaults.materialColors(
                activeTrackColor = SliderBrushColor(color = Blue400),
                inactiveTrackColor = SliderBrushColor(color = Color.Transparent)
            ),
            borderStroke = BorderStroke(1.dp, Blue400)
        )

        TitleText("drawInactiveTrack Option")
        var progress3 by remember { mutableStateOf(0f) }

        ColorfulSlider(
            value = progress3,
            thumbRadius = 10.dp,
            trackHeight = 10.dp,
            onValueChange = { it ->
                progress3 = it
            },
            colors = MaterialSliderDefaults.materialColors()
        )

        ColorfulSlider(
            value = progress3,
            thumbRadius = 10.dp,
            trackHeight = 10.dp,
            onValueChange = { it ->
                progress3 = it
            },
            colors = MaterialSliderDefaults.materialColors(),
            drawInactiveTrack = false
        )

        TitleText("coerceThumbInTrack Option")
        var progress4 by remember { mutableStateOf(0f) }

        ColorfulSlider(
            value = progress4,
            thumbRadius = 10.dp,
            trackHeight = 30.dp,
            onValueChange = { it ->
                progress4 = it
            },
            colors = MaterialSliderDefaults.materialColors(),
            coerceThumbInTrack = false

        )

        ColorfulSlider(
            value = progress4,
            thumbRadius = 10.dp,
            trackHeight = 30.dp,
            onValueChange = { it ->
                progress4 = it
            },
            colors = MaterialSliderDefaults.materialColors(),
            coerceThumbInTrack = true
        )
    }
}
