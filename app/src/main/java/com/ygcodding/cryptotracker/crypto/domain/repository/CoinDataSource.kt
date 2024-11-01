package com.ygcodding.cryptotracker.crypto.domain.repository

import com.ygcodding.cryptotracker.core.domain.util.NetworkError
import com.ygcodding.cryptotracker.core.domain.util.Result
import com.ygcodding.cryptotracker.crypto.domain.model.Coin
import com.ygcodding.cryptotracker.crypto.domain.model.CoinPrice

interface CoinDataSource {
    suspend fun getCoins() : Result<List<Coin>, NetworkError>
    suspend fun getCoinHistory(): Result<List<CoinPrice>, NetworkError>
}