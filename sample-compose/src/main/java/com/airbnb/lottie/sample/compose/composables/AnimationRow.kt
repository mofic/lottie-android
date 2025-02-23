package com.airbnb.lottie.sample.compose.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.coil.rememberCoilPainter

@Composable
fun AnimationRow(
    title: String,
    previewUrl: String,
    previewBackgroundColor: Color,
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .clickable(onClick = onClick)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = rememberCoilPainter(previewUrl),
                modifier = Modifier
                    .padding(end = 16.dp)
                    .size(40.dp)
                    .background(color = previewBackgroundColor),
                contentDescription = null
            )
            Text(
                title,
                fontSize = 16.sp,
                overflow = TextOverflow.Ellipsis
            )
        }

    }
}