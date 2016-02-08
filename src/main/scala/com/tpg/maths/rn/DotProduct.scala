package com.tpg.maths.rn

case class DotProduct(a: NDimensions, b: NDimensions) extends InnerProduct {
  type T = DotProduct

  override def innerProduct(that: T): Option[BigDecimal] = {
    if (a.dimensions == b.dimensions) {
      val temp = 0 until a.dimensions map { i => a.at(i) * b.at(i) }
      Some(temp.sum)
    }
    else {
      None
    }
  }
}
