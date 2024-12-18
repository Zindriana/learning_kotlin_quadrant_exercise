package com.example.compose_quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_quadrant.ui.theme.Compose_quadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_quadrantTheme {
                Box (
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding()
                ) {
                    CreateCard(
                        stringResource(R.string.text_composable),
                        stringResource(R.string.text_composable_content),
                        modifier = Modifier.align(Alignment.TopStart),
                        backgroundColor = Color(0xFFEADDFF)
                    )
                    CreateCard(
                        stringResource(R.string.image_composable),
                        stringResource(R.string.image_composable_content),
                        modifier = Modifier.align(Alignment.TopEnd),
                        backgroundColor = Color(0xFFD0BCFF))
                    CreateCard(stringResource(
                        R.string.row_composable),
                        stringResource(R.string.row_composable_content),
                        modifier = Modifier.align(Alignment.BottomStart),
                        backgroundColor = Color(0xFFB69DF8))
                    CreateCard(stringResource(
                        R.string.column_composable),
                        stringResource(R.string.column_composable_content),
                        modifier = Modifier.align(Alignment.BottomEnd),
                        backgroundColor = Color(0xFFF6EDFF))
                }
            }
        }
    }
}

@Composable
fun CreateCard(textOne: String, textTwo: String, modifier: Modifier = Modifier, backgroundColor: Color) {
    Box(
        modifier = modifier
            .fillMaxWidth(0.5f)
            .fillMaxHeight(0.5f)
            .background(backgroundColor)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = textOne,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            )
            Text(
                text = textTwo,
                        textAlign = TextAlign.Justify
            )
        }
    }
}
