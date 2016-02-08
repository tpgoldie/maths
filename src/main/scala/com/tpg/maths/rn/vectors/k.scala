package com.tpg.maths.rn.vectors

import com.tpg.maths.rn.BasisElement

case class k(z: BigDecimal) extends BasisElement(Vector(0, 0, 1), "k") {
  override def toString: String = s"${z}k"
}

object k {
  implicit def toK(value: BigDecimal): k = new k(value)
}