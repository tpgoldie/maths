package com.tpg.maths.rn.quaternions

import com.tpg.maths.rn.BasisElement

case class J1(q1: BigDecimal = 1) extends BasisElement(Quaternion(0, 1, 0, 0), "J1"){
  override def toString: String = s"${format(q1)}J1"
}

object J1 extends J1(1) {
  def *(that: J1.type): J1 = J1(-1)
  def *(that: J0.type): J1.type = J1
  def *(that: J2.type): J3.type = J3
  def *(that: J3.type): J2 = J2(-1)
}
