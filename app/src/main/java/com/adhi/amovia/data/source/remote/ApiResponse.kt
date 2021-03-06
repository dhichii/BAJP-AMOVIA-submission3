package com.adhi.amovia.data.source.remote

class ApiResponse<T>(val status: StatusResponse, val body: T, val msg: String?) {
    companion object {
        fun <T> success(body: T): ApiResponse<T> =
            ApiResponse(StatusResponse.SUCCESS, body, null)

        fun <T> error(msg: String, body: T): ApiResponse<T> =
            ApiResponse(StatusResponse.ERROR, body, msg)
    }
}