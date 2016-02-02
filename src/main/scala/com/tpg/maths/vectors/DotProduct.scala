package com.tpg.maths.vectors

case class DotProduct(a: Vector, b: Vector) extends InnerProduct {
  def innerProduct: Option[BigDecimal] = {
    if (a.dimension == b.dimension) {
      val temp = 0 until a.dimension map { i => a.at(i) * b.at(i) }
      Some(temp.sum)
    }
    else {
      None
    }
  }
}
