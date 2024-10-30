package com.ygcodding.cryptotracker.crypto.presentation.coin_list

import com.ygcodding.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}