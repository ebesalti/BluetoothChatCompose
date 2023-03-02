package com.besalti.bluetoothchatcompose.presentation

import com.besalti.bluetoothchatcompose.domain.chat.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList()
)