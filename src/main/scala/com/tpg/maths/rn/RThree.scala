package com.tpg.maths.rn

case class RThree(x: BigDecimal, y: BigDecimal, z: BigDecimal) extends EuclideanSpace(IndexedSeq(x, y, z)) {
  override def toString: String = s"(${x}, ${y}, ${z})"

  override def innerProduct(that: T): Option[BigDecimal] = super.innerProduct(that.asInstanceOf[EuclideanSpace])
}
