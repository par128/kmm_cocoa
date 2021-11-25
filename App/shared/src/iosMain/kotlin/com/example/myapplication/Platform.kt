package com.example.myapplication

import platform.UIKit.UIDevice
import cocoapods.AFNetworking.*
import com.example.lib.Report

actual class Platform actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() +
            " " + UIDevice.currentDevice.systemVersion +
            " " + AFNetworkingReachabilityNotificationStatusItem +
            " lib.message=" + Report().message
}