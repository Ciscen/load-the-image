package com.lt.load_the_image

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

/**
 * Load the image to @Composable Image
 * [url]Can use Net url or native url
 */
@Composable
fun rememberImagePainter(url: String): Painter {
    return LoadTheImageManager.load(url) ?: painterResource("drawable-xxhdpi/load_error.jpeg")// TODO by lt 2022/4/10 11:11  处理一下
}