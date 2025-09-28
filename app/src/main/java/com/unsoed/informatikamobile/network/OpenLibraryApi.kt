package com.unsoed.informatikamobile.network

import com.unsoed.informatikamobile.data.mobile.SearchResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenLibraryApi {

    @GET("search.json")
    suspend fun serachBooks(
        @Query("q") query: String,
        @Query("limit") limit: Int
    ): Response<SearchResponse>
}