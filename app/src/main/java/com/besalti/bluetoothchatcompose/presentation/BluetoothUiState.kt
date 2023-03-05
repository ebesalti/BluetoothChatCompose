package com.besalti.bluetoothchatcompose.presentation

import com.besalti.bluetoothchatcompose.domain.chat.BluetoothDevice
import java.security.MessageDigest

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val errorMessage: String? = null,
)