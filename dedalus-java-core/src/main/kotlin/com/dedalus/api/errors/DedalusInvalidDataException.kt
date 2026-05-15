package com.dedalus.api.errors

class DedalusInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : DedalusException(message, cause)
