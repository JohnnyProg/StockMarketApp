package com.plcoding.stockmarketapp.domain.model

import java.time.LocalDateTime

data class IntradayInfo(
    val timestamp: LocalDateTime,
    val close: Double
)