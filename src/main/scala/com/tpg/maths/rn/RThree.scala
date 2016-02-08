package com.tpg.maths.rn

case class RThree(x: BigDecimal, y: BigDecimal, z: BigDecimal) extends EuclideanSpace(IndexedSeq(x, y, z)) {
  override def toString: String = s"(${x}, ${y}, ${z})"

  override def innerProduct(that: T): Option[BigDecimal] = super.innerProduct(that.asInstanceOf[EuclideanSpace])

  def dot(that: RThree): BigDecimal = innerProduct(that).get

  def +(that: RThree): RThree = RThree(x + that.x, y + that.y, z + that.z)

  def -(that: RThree): RThree = RThree(x - that.x, y - that.y, z - that.z)

  def x(that: RThree): RThree = {
    val a = this
    val b = that

    val c0 = a.at(1) * b.at(2) - a.at(2) * b.at(1)
    val c1 = a.at(2) * b.at(0) - a.at(0) * b.at(2)
    val c2 = a.at(0) * b.at(1) - a.at(1) * b.at(0)

    RThree(c0, c1, c2)
  }

  def *(value: BigDecimal): RThree = RThree(x * value, y * value, z * value)
}
