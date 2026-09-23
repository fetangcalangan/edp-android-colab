package com.liceo.account.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    @SerialName("id")
    val id: String? = null,
    @SerialName("fullname")
    val fullname: String? = null,
    @SerialName("email")
    val email: String? = null,
    @SerialName("password")
    val password: String? = null,
    @SerialName("birthdate")
    val birthdate: String? = null
)

@Serializable
data class NewUserDto(
    @SerialName("fullname")
    val fullname: String,
    @SerialName("email")
    val email: String,
    @SerialName("password")
    val password: String,
    @SerialName("birthdate")
    val birthdate: String
)
