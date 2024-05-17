package com.example.bussinescardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinescardapp.ui.theme.BussinesCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinesCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BussinesCardApp()
                }
            }
        }
    }
}

@Composable
fun BussinesCardApp(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    val bgColor = colorResource(R.color.bgApp)
    val bgShape = colorResource(R.color.bgIcon)
    val headlineColor = colorResource(R.color.headline_color)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(color = bgColor)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .background(color = bgShape)
            ) {
                Image(
                    painter = image,
                    contentDescription = "Android Logo",
                    Modifier.size(150.dp)
                    )
            }
            Text(
                text = "Reza A. Maulana",
                fontSize = 35.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(5.dp)
            )
            Text(
                text = "Android Developer Extraordinaire",
                color = headlineColor,
                fontWeight = FontWeight.Bold
            )
        }
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(bottom = 25.dp)
    ) {
        Column{
            Row {
                Icon(
                    Icons.Filled.Phone,
                    contentDescription = null,
                    tint = headlineColor
                )
                Spacer(modifier = Modifier.padding(10.dp))
                Text(
                    text = stringResource(R.string.phone_number),
                )

            }
            Spacer(modifier = Modifier.padding(5.dp))
            Row {
                Icon(
                    Icons.Filled.AccountCircle,
                    contentDescription = null,
                    tint = headlineColor
                )
                Spacer(modifier = Modifier.padding(10.dp))
                Text(
                    text = stringResource(R.string.username),
                )

            }
            Spacer(modifier = Modifier.padding(5.dp))
            Row {
                Icon(
                    Icons.Filled.Email,
                    contentDescription = null,
                    tint = headlineColor
                )
                Spacer(modifier = Modifier.padding(10.dp))
                Text(
                    text = stringResource(R.string.email),
                )

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BussinesCardPreview(modifier: Modifier = Modifier){
    BussinesCardAppTheme {
        BussinesCardApp()
    }
}
