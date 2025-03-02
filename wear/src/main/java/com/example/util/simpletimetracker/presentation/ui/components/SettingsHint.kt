/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package com.example.util.simpletimetracker.presentation.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Text
import androidx.wear.tooling.preview.devices.WearDevices
import com.example.util.simpletimetracker.presentation.screens.settings.SettingsItemType

@Composable
fun SettingsHint(
    state: SettingsItem.Hint,
) {
    Column(
        Modifier
            .padding(bottom = 3.dp)
            .padding(horizontal = 4.dp)
            .fillMaxWidth(),
    ) {
        Text(
            text = state.hint,
            fontWeight = FontWeight.Light,
            fontSize = 11.sp,
            lineHeight = 11.sp,
        )
    }
}

@Preview(device = WearDevices.LARGE_ROUND)
@Composable
private fun SettingsHintPreview() {
    SettingsHint(
        state = SettingsItem.Hint(
            type = SettingsItemType.AllowMultitaskingHint,
            hint = "Check box hint",
        ),
    )
}

@Preview(device = WearDevices.LARGE_ROUND)
@Composable
private fun SettingsHintLongPreview() {
    SettingsHint(
        state = SettingsItem.Hint(
            type = SettingsItemType.AllowMultitaskingHint,
            hint = "Check box hint Check box hint Check box hint Check box hint Check box hint ",
        ),
    )
}