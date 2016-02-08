package com.tpg.maths.rn

trait InnerProduct {
  type T <: InnerProduct

  def innerProduct(that: T): Option[BigDecimal]
}
