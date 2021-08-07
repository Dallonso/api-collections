package one.digitalinnovation.collections

import java.math.BigDecimal

fun Array<BigDecimal>.summation() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.summation() / this.size.toBigDecimal()
