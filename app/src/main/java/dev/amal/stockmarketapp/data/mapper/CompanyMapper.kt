package dev.amal.stockmarketapp.data.mapper

import dev.amal.stockmarketapp.data.local.CompanyListingEntity
import dev.amal.stockmarketapp.data.remote.dto.CompanyInfoDto
import dev.amal.stockmarketapp.domain.model.CompanyInfo
import dev.amal.stockmarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing =
    CompanyListing(name = name, symbol = symbol, exchange = exchange)

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity =
    CompanyListingEntity(name = name, symbol = symbol, exchange = exchange)

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo =
    CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
