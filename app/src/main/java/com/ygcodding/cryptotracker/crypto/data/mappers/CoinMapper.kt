package com.ygcodding.cryptotracker.crypto.data.mappers

import android.os.Build
import androidx.annotation.RequiresApi
import com.ygcodding.cryptotracker.crypto.data.dto.CoinDto
import com.ygcodding.cryptotracker.crypto.data.dto.CoinPriceDto
import com.ygcodding.cryptotracker.crypto.domain.model.Coin
import com.ygcodding.cryptotracker.crypto.domain.model.CoinPrice
import java.time.Instant
import java.time.ZoneId

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

@RequiresApi(Build.VERSION_CODES.O)
fun CoinPriceDto.toCoinPrice() : CoinPrice {
    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = Instant.ofEpochMilli(time).atZone(ZoneId.of("UTC"))
    )
}