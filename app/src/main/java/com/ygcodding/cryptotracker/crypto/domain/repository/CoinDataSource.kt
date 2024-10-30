package com.ygcodding.cryptotracker.crypto.domain.repository

import com.ygcodding.cryptotracker.core.domain.util.NetworkError
import com.ygcodding.cryptotracker.core.domain.util.Result
import com.ygcodding.cryptotracker.crypto.domain.model.Coin

interface CoinDataSource {
    suspend fun getCoins() : Result<List<Coin>, NetworkError>
}