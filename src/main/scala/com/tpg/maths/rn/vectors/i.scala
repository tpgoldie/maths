package com.tpg.maths.rn.vectors

case class i(x: BigDecimal) extends BasisElement(Vector(1, 0, 0), "i") {
  override def toString: String = s"${x}i"
}

object i {
  implicit def toI(value: BigDecimal): i = new i(value)
}
