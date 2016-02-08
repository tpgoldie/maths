package com.tpg.maths.rn.quaternions

import com.tpg.maths.rn.BasisElement

case class J3(q3: BigDecimal = 1) extends BasisElement(Quaternion(0, 0, 0, 1), "J3"){
}

object J3 extends BasisElement(Quaternion(0, 0, 0, 1), "J3") {
  def *(that: J3.type): J0 = J0(-1)
  def *(that: J0.type): J3.type = J3
  def *(that: J1.type): J2.type = J2
  def *(that: J2.type): J1 = J1(-1)
}
