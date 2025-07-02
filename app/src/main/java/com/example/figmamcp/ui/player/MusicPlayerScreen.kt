package com.example.figmamcp.ui.player

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.figmamcp.ui.player.component.PlayerAppBar
import com.example.figmamcp.ui.player.component.PlayerControlButtons
import com.example.figmamcp.ui.player.component.PlayerJacketAndTitle
import com.example.figmamcp.ui.player.component.PlayerOptionButtons
import com.example.figmamcp.ui.player.component.PlayerProgressBar
import com.example.figmamcp.ui.theme.FigmamcpsampleandroidTheme
import com.example.figmamcp.ui.theme.Spacing

@Composable
fun MusicPlayerScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = Spacing.M),
        verticalArrangement = Arrangement.Top
    ) {
        PlayerAppBar()
        Spacer(modifier = Modifier.height(Spacing.L))
        PlayerJacketAndTitle()
        Spacer(modifier = Modifier.height(Spacing.L))
        PlayerProgressBar(progress = 0.2f, elapsed = "0:42", total = "3:01")
        Spacer(modifier = Modifier.height(Spacing.XL))
        PlayerControlButtons()
        Spacer(modifier = Modifier.height(Spacing.L))
        PlayerOptionButtons()
    }
}

@Preview(showBackground = true)
@Composable
private fun MusicPlayerScreenPreview() {
    FigmamcpsampleandroidTheme {
        MusicPlayerScreen()
    }
}