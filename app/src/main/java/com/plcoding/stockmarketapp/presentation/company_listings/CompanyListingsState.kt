package com.plcoding.stockmarketapp.presentation.company_listings

import android.app.DownloadManager.Query
import com.plcoding.stockmarketapp.domain.model.CompanyListing

data class CompanyListingsState(
    val companies: List<CompanyListing> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = ""
)
