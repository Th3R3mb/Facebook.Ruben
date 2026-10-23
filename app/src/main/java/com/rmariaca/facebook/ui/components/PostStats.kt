package com.rmariaca.facebook.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PostStats(
    modifier: Modifier = Modifier,
    likesCount: Int = 24,
    commentsCount: Int = 3,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        // Ícono de reacción (Me gusta)
        Text(
            text = "👍",
            fontSize = 14.sp,
        )

        Spacer(modifier = Modifier.width(6.dp))

        // Número de Me gusta
        Text(
            text = likesCount.toString(),
            color = Color.Gray,
            fontSize = 14.sp,
        )

        // Espaciador para empujar el contador de comentarios a la derecha
        Spacer(modifier = Modifier.weight(1f))

        // Número de comentarios
        Text(
            text = "$commentsCount comentarios",
            color = Color.Gray,
            fontSize = 14.sp,
        )
    }
}
