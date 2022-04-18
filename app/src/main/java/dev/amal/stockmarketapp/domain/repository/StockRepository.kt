package dev.amal.stockmarketapp.domain.repository

import dev.amal.stockmarketapp.domain.model.CompanyListing
import dev.amal.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}