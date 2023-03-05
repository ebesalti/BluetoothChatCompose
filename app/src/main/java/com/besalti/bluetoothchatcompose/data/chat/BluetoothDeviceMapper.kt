package com.besalti.bluetoothchatcompose.data

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.besalti.bluetoothchatcompose.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}