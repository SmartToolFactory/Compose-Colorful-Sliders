package com.smarttoolfactory.composematerialslider.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.smarttoolfactory.composematerialslider.*

@Composable
fun SliderGradientDemo2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val modifier = Modifier
            .padding(8.dp)
            .shadow(2.dp, RoundedCornerShape(8.dp))
            .background(Color.White)
            .padding(4.dp)

        val sliderModifier = Modifier.padding(horizontal = 8.dp)

        // Colorful sliders that change color based on the current properties they had
        HSVSliderExamples(modifier, sliderModifier)
        HSLSliderExamples(modifier, sliderModifier)
        RGBSliderExamples(modifier, sliderModifier)

    }
}

@Composable
private fun HSVSliderExamples(modifier: Modifier, sliderModifier: Modifier) {

    var hue by remember { mutableStateOf(0f) }
    var saturation by remember { mutableStateOf(.5f) }
    var value by remember { mutableStateOf(.5f) }
    var alpha by remember { mutableStateOf(1f) }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        SliderHueHSV(
            modifier = sliderModifier,
            hue = hue,
            saturation = saturation,
            value = value,
            onValueChange = {
                hue = it
            }
        )


        SliderSaturationHSV(
            modifier = sliderModifier,
            hue = hue,
            saturation = saturation,
            value = value,
            onValueChange = { value ->
                saturation = value
            }
        )

        SliderValueHSV(
            modifier = sliderModifier,
            hue = hue,
            value = value,
            onValueChange = { result ->
                value = result
            }
        )

        SliderAlphaHSV(
            modifier = sliderModifier,
            hue = hue, alpha = alpha,
            onValueChange = {
                alpha = it
            }
        )
    }

}

@Composable
private fun HSLSliderExamples(modifier: Modifier, sliderModifier: Modifier) {

    var hue by remember { mutableStateOf(0f) }
    var saturation by remember { mutableStateOf(.5f) }
    var lightness by remember { mutableStateOf(.5f) }
    var alpha by remember { mutableStateOf(1f) }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SliderHueHSL(
            modifier = sliderModifier,
            hue = hue,
            saturation = saturation,
            lightness = lightness,
            onValueChange = {
                hue = it
            }
        )

        SliderSaturationHSL(
            modifier = sliderModifier,
            hue = hue,
            saturation = saturation,
            lightness = lightness,
            onValueChange = { value ->
                saturation = value
            }
        )

        SliderLightnessHSL(
            modifier = sliderModifier,
            lightness = lightness,
            onValueChange = { result ->
                lightness = result
            }
        )

        SliderAlphaHSL(
            modifier = sliderModifier,
            hue = hue,
            alpha = alpha,
            onValueChange = {
                alpha = it
            }
        )
    }
}

@Composable
private fun RGBSliderExamples(modifier: Modifier, sliderModifier: Modifier) {

    var red by remember { mutableStateOf(1f) }
    var green by remember { mutableStateOf(0f) }
    var blue by remember { mutableStateOf(0f) }
    var alpha by remember { mutableStateOf(1f) }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        SliderRedRGB(
            modifier = sliderModifier,
            red = red,
            onValueChange = { result ->
                red = result.coerceIn(0f, 1f)
            }
        )

        SliderGreenRGB(
            modifier = sliderModifier,
            green = green,
            onValueChange = { result ->
                green = result.coerceIn(0f, 1f)
            }
        )

        SliderBlueRGB(
            modifier = sliderModifier,
            blue = blue,
            onValueChange = { result ->
                blue = result.coerceIn(0f, 1f)
            }
        )

        SliderAlphaRGB(
            modifier = sliderModifier,
            red = red,
            green = green,
            blue = blue,
            alpha = alpha,
            onValueChange = {
                alpha = it
            }
        )
    }
}
