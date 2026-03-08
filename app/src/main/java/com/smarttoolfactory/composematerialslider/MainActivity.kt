package com.smarttoolfactory.composematerialslider

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.smarttoolfactory.composematerialslider.demo.*
import com.smarttoolfactory.composematerialslider.ui.theme.BlueSmartDark
import com.smarttoolfactory.composematerialslider.ui.theme.ComposeMaterialSliderTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMaterialSliderTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        HomeContent()
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
private fun HomeContent() {

    val pagerState: PagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { tabList.size }
    )
    val coroutineScope = rememberCoroutineScope()

    ScrollableTabRow(
        backgroundColor = BlueSmartDark,
        contentColor = Color.White,
        edgePadding = 8.dp,
        // Our selected tab is our current page
        selectedTabIndex = pagerState.currentPage,
        // Override the indicator, using the provided pagerTabIndicatorOffset modifier
        indicator = {}
    ) {
        // Add tabs for all of our pages
        tabList.forEachIndexed { index, title ->
            Tab(
                text = { Text(title) },
                selected = pagerState.currentPage == index,
                onClick = {
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                },
            )
        }
    }

    HorizontalPager(state = pagerState) { page: Int ->

        when (page) {
            0 -> ColorfulSliderDemo()
            1 -> SliderPropertiesDemo()
            2 -> ColorfulIconSliderDemo()
            3 -> SliderWithLabelDemo()
            4 -> SliderGradientDemo()
            else -> SliderGradientDemo2()
        }
    }
}

internal val tabList =
    listOf(
        "Slider Dimensions",
        "Slider Properties",
        "Slider with Icon",
        "Slider with Label",
        "Slider Gradients1",
        "Slider Gradients2",
    )
