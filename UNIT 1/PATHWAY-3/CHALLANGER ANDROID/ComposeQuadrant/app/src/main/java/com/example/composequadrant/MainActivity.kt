    package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            Modifier.weight(1F)
        ) {
            ComposableInfoCard(title = stringResource(R.string.text_c), description = stringResource(
            R.string.text_c_des), bgCard = Color(0xFFEADDFF), modifier = modifier.weight(1F) )
            ComposableInfoCard(title = stringResource(R.string.image_c), description = stringResource(
            R.string.image_c_des), bgCard = Color(0xFFD0BCFF), modifier = modifier.weight(1F) )
        }
        Row(
            Modifier.weight(1F)
        ) {
            ComposableInfoCard(title = stringResource(R.string.row_c), description = stringResource(
            R.string.row_c_des), bgCard = Color(0xFFB69DF8), modifier = modifier.weight(1F) )
            ComposableInfoCard(title = stringResource(R.string.column_c), description = stringResource(
            R.string.column_c_des), bgCard = Color(0xFFF6EDFF), modifier = modifier.weight(1F) )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    bgCard: Color,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(bgCard)
            .padding(16.dp)
    ) {
        //Title Text
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        //Description Text
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrantApp()
    }
}