package com.tpg.maths.rn.quaternions

import com.tpg.maths.rn.{EuclideanSpace, RThree}

case class Quaternion(q0: BigDecimal, q1: BigDecimal, q2: BigDecimal, q3: BigDecimal)
  extends EuclideanSpace(IndexedSeq(q0, q1, q2, q3)) {

  val q: RThree = RThree(q1, q2, q3)

  def +(that: Quaternion): Quaternion = Quaternion(0 until dimensions map {i => this.elements(i) + that.elements(i) })

  def -(that: Quaternion): Quaternion = Quaternion(0 until dimensions map {i => this.elements(i) - that.elements(i) })

  def *(value: BigDecimal): Quaternion = Quaternion(0 until dimensions map {i => this.elements(i) * value })
}

object Quaternion {
  def apply(elements: IndexedSeq[BigDecimal]): Quaternion = new Quaternion(elements(0), elements(1), elements(2), elements(3))
}