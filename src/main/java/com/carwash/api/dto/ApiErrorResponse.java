package com.carwash.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Standard API error response")

public record ApiErrorResponse(
        @Schema(example = "404") int status,
        @Schema(example = "Resource not found") String message,
        @Schema(example = "2026-05-16T10:15:30") String timestamp,
        @Schema(example = "/api/users/u1") String path
) {}
