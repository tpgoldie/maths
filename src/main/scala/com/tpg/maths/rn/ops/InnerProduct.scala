package com.tpg.maths.rn.ops

trait InnerProduct {
  type T <: InnerProduct

  def innerProduct(that: T): Option[BigDecimal]
}
