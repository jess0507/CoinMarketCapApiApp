package com.jess.coinmarketcapapiapp.presentation.info

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.google.gson.Gson
import com.jess.coinmarketcapapiapp.data.remote.dto.HistoricalResponse
import com.jess.coinmarketcapapiapp.data.remote.dto.Quote
import com.jess.coinmarketcapapiapp.ui.theme.DarkBlue

@Composable
fun InfoScreen(navController: NavHostController, symbol: String?) {
    InfoScreen(symbol)
}

@Composable
internal fun InfoScreen(symbol: String?, infoViewModel: InfoViewModel = hiltViewModel()) {
    val state = infoViewModel.state
    val isLoading = infoViewModel.isLoading
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkBlue)
            .statusBarsPadding()
            .navigationBarsPadding()
            .padding(PaddingValues(start = 16.dp, end = 16.dp, bottom = 16.dp)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        if (isLoading && state.isEmpty()) {
            CircularProgressIndicator()
        } else {
            Chart(quotes = state)
        }
    }
}

@Preview
@Composable
fun PreviewInfoScreen() {
    val historicalResponse = Gson().fromJson(
        """
            {
                "status": {
                    "timestamp": "2024-06-11T02:32:46.824Z",
                    "error_code": 0,
                    "error_message": null,
                    "elapsed": 1,
                    "credit_count": 1,
                    "notice": null
                },
                "data": {
                    "OKB": {
                        "id": 9972,
                        "name": "18kmxn0la3t",
                        "symbol": "OKB",
                        "quotes": [
                            {
                                "time_open": "2024-06-11T02:32:46.824Z",
                                "time_close": "2024-06-11T02:32:46.824Z",
                                "time_high": "2024-06-11T02:32:46.824Z",
                                "time_low": "2024-06-11T02:32:46.824Z",
                                "quote": {
                                    "USD": {
                                        "open": 0.8018985264256264,
                                        "high": 0.42534554049118145,
                                        "low": 0.7701623907838011,
                                        "close": 0.6917922612396279,
                                        "volume": 0.24221423743059023,
                                        "market_cap": 0.9201988449984662,
                                        "timestamp": "2024-06-11T02:32:46.824Z"
                                    }
                                }
                            },
                            {
                                "time_open": "2024-06-11T02:32:46.824Z",
                                "time_close": "2024-06-11T02:32:46.824Z",
                                "time_high": "2024-06-11T02:32:46.824Z",
                                "time_low": "2024-06-11T02:32:46.824Z",
                                "quote": {
                                    "USD": {
                                        "open": 0.9975645742159214,
                                        "high": 0.9654497969131561,
                                        "low": 0.7998288592903151,
                                        "close": 0.9737865639256997,
                                        "volume": 0.532826273667194,
                                        "market_cap": 0.019598061293483404,
                                        "timestamp": "2024-06-11T02:32:46.824Z"
                                    }
                                }
                            },
                            {
                                "time_open": "2024-06-11T02:32:46.824Z",
                                "time_close": "2024-06-11T02:32:46.824Z",
                                "time_high": "2024-06-11T02:32:46.824Z",
                                "time_low": "2024-06-11T02:32:46.824Z",
                                "quote": {
                                    "USD": {
                                        "open": 0.9161601550478331,
                                        "high": 0.3579694871706116,
                                        "low": 0.22691971587058068,
                                        "close": 0.7292306251372416,
                                        "volume": 0.5240110189704754,
                                        "market_cap": 0.7174274377212042,
                                        "timestamp": "2024-06-11T02:32:46.824Z"
                                    }
                                }
                            },
                            {
                                "time_open": "2024-06-11T02:32:46.824Z",
                                "time_close": "2024-06-11T02:32:46.824Z",
                                "time_high": "2024-06-11T02:32:46.824Z",
                                "time_low": "2024-06-11T02:32:46.824Z",
                                "quote": {
                                    "USD": {
                                        "open": 0.9247846441329719,
                                        "high": 0.9521551918435327,
                                        "low": 0.7178663801037588,
                                        "close": 0.8653742790037249,
                                        "volume": 0.6370635970262191,
                                        "market_cap": 0.18603614775859523,
                                        "timestamp": "2024-06-11T02:32:46.824Z"
                                    }
                                }
                            },
                            {
                                "time_open": "2024-06-11T02:32:46.824Z",
                                "time_close": "2024-06-11T02:32:46.824Z",
                                "time_high": "2024-06-11T02:32:46.824Z",
                                "time_low": "2024-06-11T02:32:46.824Z",
                                "quote": {
                                    "USD": {
                                        "open": 0.9870696589466057,
                                        "high": 0.43801529854161947,
                                        "low": 0.8962162034576346,
                                        "close": 0.44556044385510596,
                                        "volume": 0.12353295501409645,
                                        "market_cap": 0.532038795638782,
                                        "timestamp": "2024-06-11T02:32:46.824Z"
                                    }
                                }
                            },
                            {
                                "time_open": "2024-06-11T02:32:46.824Z",
                                "time_close": "2024-06-11T02:32:46.824Z",
                                "time_high": "2024-06-11T02:32:46.824Z",
                                "time_low": "2024-06-11T02:32:46.824Z",
                                "quote": {
                                    "USD": {
                                        "open": 0.9577520352379303,
                                        "high": 0.866005257088936,
                                        "low": 0.7097421424332762,
                                        "close": 0.19171587801124357,
                                        "volume": 0.03767461190121524,
                                        "market_cap": 0.22644758284359012,
                                        "timestamp": "2024-06-11T02:32:46.824Z"
                                    }
                                }
                            },
                            {
                                "time_open": "2024-06-11T02:32:46.824Z",
                                "time_close": "2024-06-11T02:32:46.824Z",
                                "time_high": "2024-06-11T02:32:46.824Z",
                                "time_low": "2024-06-11T02:32:46.824Z",
                                "quote": {
                                    "USD": {
                                        "open": 0.7227729006459509,
                                        "high": 0.6615115598093486,
                                        "low": 0.5359795807936112,
                                        "close": 0.8217707808119497,
                                        "volume": 0.4891435086370499,
                                        "market_cap": 0.7866702554829088,
                                        "timestamp": "2024-06-11T02:32:46.824Z"
                                    }
                                }
                            },
                            {
                                "time_open": "2024-06-11T02:32:46.824Z",
                                "time_close": "2024-06-11T02:32:46.824Z",
                                "time_high": "2024-06-11T02:32:46.824Z",
                                "time_low": "2024-06-11T02:32:46.824Z",
                                "quote": {
                                    "USD": {
                                        "open": 0.4937300431756102,
                                        "high": 0.840861126905736,
                                        "low": 0.25666295391288063,
                                        "close": 0.4761788766201507,
                                        "volume": 0.3249154591463175,
                                        "market_cap": 0.04126919822732744,
                                        "timestamp": "2024-06-11T02:32:46.824Z"
                                    }
                                }
                            },
                            {
                                "time_open": "2024-06-11T02:32:46.824Z",
                                "time_close": "2024-06-11T02:32:46.824Z",
                                "time_high": "2024-06-11T02:32:46.824Z",
                                "time_low": "2024-06-11T02:32:46.824Z",
                                "quote": {
                                    "USD": {
                                        "open": 0.7479690195905242,
                                        "high": 0.38851449947025407,
                                        "low": 0.3448218723226222,
                                        "close": 0.4264372209036864,
                                        "volume": 0.7206084190426416,
                                        "market_cap": 0.43640586497184364,
                                        "timestamp": "2024-06-11T02:32:46.824Z"
                                    }
                                }
                            },
                            {
                                "time_open": "2024-06-11T02:32:46.824Z",
                                "time_close": "2024-06-11T02:32:46.824Z",
                                "time_high": "2024-06-11T02:32:46.824Z",
                                "time_low": "2024-06-11T02:32:46.824Z",
                                "quote": {
                                    "USD": {
                                        "open": 0.02035937596461812,
                                        "high": 0.9557065508107929,
                                        "low": 0.10778950621719985,
                                        "close": 0.3900032699567533,
                                        "volume": 0.658782341012961,
                                        "market_cap": 0.9437210834101204,
                                        "timestamp": "2024-06-11T02:32:46.824Z"
                                    }
                                }
                            }
                        ]
                    }
                }
            }
        """.trimIndent(),
        HistoricalResponse::class.java
    )
    val quote: List<Quote> = historicalResponse.data.values.firstOrNull()?.quotes ?: emptyList()
    Chart(quotes = quote)
}