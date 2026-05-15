// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.errors

import com.dedalus.api.core.JsonValue
import com.dedalus.api.core.http.Headers

abstract class DedalusServiceException
protected constructor(message: String, cause: Throwable? = null) :
    DedalusException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
