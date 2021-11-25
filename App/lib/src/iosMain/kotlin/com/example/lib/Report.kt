package com.example.lib

import cocoapods.AFNetworking.*

actual class Report actual constructor() {
    actual val message: String
        get() = "apple " + AFNetworkingReachabilityNotificationStatusItem
}