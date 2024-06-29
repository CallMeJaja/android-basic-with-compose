package com.example.cupcake.ui.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.cupcake.R

/**
 * Composable that displays formatted [price] that will be formatted adn displayed on screen
 */
@Composable
fun FormattedPriceLabel(modifier: Modifier = Modifier, subtotal: String) {
    Text(
        text = stringResource(id = R.string.subtotal_price, subtotal),
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall
    )
}