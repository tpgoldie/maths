package com.tpg.maths.rn.quaternions

import com.tpg.maths.rn.BasisElement

case class J2(q2: BigDecimal = 1) extends BasisElement(Quaternion(0, 0, 1, 0), "J2"){
  override def toString: String = s"${format(q2)}J2"
}

object J2 extends J2(1) {
  def *(that: J2.type): J0 = J0(-1)
  def *(that: J0.type): J2.type = J2
  def *(that: J1.type): J3 = J3(-1)
}
