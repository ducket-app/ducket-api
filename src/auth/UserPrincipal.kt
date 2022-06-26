package io.ducket.api.auth

import io.ktor.auth.*

data class UserPrincipal(
    val id: Long,
    val email: String,
    val role: UserRole,
): Principal