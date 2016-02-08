package com.tpg.maths.rn.quaternions

import com.tpg.maths.rn.BasisElement

case class J0(q0: BigDecimal = 1) extends BasisElement(Quaternion(1, 0, 0, 0), "J0"){
  def -(that: J0): J0 = J0(this.q0 - that.q0)
}

object J0 extends J0(1) {
  def *(that: J0.type): J0.type = J0
  def *(that: J1.type): J1.type = J1
  def *(that: J2.type): J2.type = J2
  def *(that: J3.type): J3.type = J3
}
