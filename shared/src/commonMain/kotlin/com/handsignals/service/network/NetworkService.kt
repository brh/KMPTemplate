package com.handsignals.service.network

import io.ktor.client.HttpClient
import org.koin.core.annotation.Single

@Single
data class NetworkService(val client: HttpClient) {
}