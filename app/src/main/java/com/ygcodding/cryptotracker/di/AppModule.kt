package com.ygcodding.cryptotracker.di

import com.ygcodding.cryptotracker.core.data.networking.HttpClientFactory
import com.ygcodding.cryptotracker.crypto.domain.repository.CoinDataSource
import com.ygcodding.cryptotracker.crypto.data.repository.RemoteCoinDataSource
import com.ygcodding.cryptotracker.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()
    viewModelOf(::CoinListViewModel)
}