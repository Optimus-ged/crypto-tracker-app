package com.ygcodding.cryptotracker.crypto.data.mappers

import com.ygcodding.cryptotracker.crypto.data.dto.CoinDto
import com.ygcodding.cryptotracker.crypto.domain.model.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}