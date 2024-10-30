package com.ygcodding.cryptotracker.crypto.data.repository

import com.ygcodding.cryptotracker.core.data.networking.constructUrl
import com.ygcodding.cryptotracker.core.data.networking.safeCall
import com.ygcodding.cryptotracker.core.domain.util.NetworkError
import com.ygcodding.cryptotracker.core.domain.util.Result
import com.ygcodding.cryptotracker.core.domain.util.map
import com.ygcodding.cryptotracker.crypto.data.dto.CoinsResponseDto
import com.ygcodding.cryptotracker.crypto.data.mappers.toCoin
import com.ygcodding.cryptotracker.crypto.domain.model.Coin
import com.ygcodding.cryptotracker.crypto.domain.repository.CoinDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteCoinDataSource(
    private val httpClient: HttpClient
): CoinDataSource {

    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinsResponseDto> {
            httpClient.get(
                urlString = constructUrl("/assets")
            )
        }.map { response ->
            response.data.map { it.toCoin() }
        }
    }
}