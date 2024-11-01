package com.ygcodding.cryptotracker.crypto.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinHistoryDto(
    val data : List<CoinPriceDto>
)
