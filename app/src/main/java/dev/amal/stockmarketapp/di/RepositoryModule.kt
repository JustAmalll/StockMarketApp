package dev.amal.stockmarketapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.amal.stockmarketapp.data.csv.CSVParser
import dev.amal.stockmarketapp.data.csv.CompanyListingsParser
import dev.amal.stockmarketapp.data.repository.StockRepositoryImpl
import dev.amal.stockmarketapp.domain.model.CompanyListing
import dev.amal.stockmarketapp.domain.repository.StockRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}