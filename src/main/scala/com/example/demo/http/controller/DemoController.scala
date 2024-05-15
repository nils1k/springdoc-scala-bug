package com.example.demo.http.controller

import com.example.demo.domain.model.User
import io.swagger.v3.oas.annotations.{Operation, Parameter}
import io.swagger.v3.oas.annotations.enums.ParameterIn
import io.swagger.v3.oas.annotations.media.{Content, Schema}
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.MediaType
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.{GetMapping, PostMapping, RequestBody, RequestMapping, RequestParam, RestController}

@RestController
@RequestMapping(value = Array("api/demo"), produces = Array(MediaType.APPLICATION_JSON_VALUE))
class DemoController {

    @PostMapping
    @Operation(summary = "Post user")
    @ApiResponse(responseCode = "200", description = "Returns the info")
    @ApiResponse(responseCode = "404", description = "Resource not found")
    @ApiResponse(responseCode = "500", description = "Internal server error")
    def demo(@RequestBody entity: User): String = "ok"
}
