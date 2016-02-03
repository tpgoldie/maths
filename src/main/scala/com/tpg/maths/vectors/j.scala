package com.tpg.maths.vectors

case class j(y: BigDecimal) extends BasisElement(Vector(0, 1, 0), "j") {
  override def toString: String = s"${y}j"
}

object j {
  implicit def toJ(value: BigDecimal): j = new j(value)
}
