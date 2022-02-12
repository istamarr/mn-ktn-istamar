package com.istamar.mn.ktn

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.istamar.mn.ktn")
		.start()
}

