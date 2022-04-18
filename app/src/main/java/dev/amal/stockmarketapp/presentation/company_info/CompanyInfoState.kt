package dev.amal.stockmarketapp.presentation.company_info

import dev.amal.stockmarketapp.domain.model.CompanyInfo
import dev.amal.stockmarketapp.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)