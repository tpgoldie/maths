package com.tpg.maths.rn.quaternions

import com.tpg.maths.rn.quaternions.Quaternion.MinusOne
import com.tpg.maths.rn.{RThree, EuclideanSpace}

case class Quaternion(q0: BigDecimal, q1: BigDecimal, q2: BigDecimal, q3: BigDecimal)
  extends EuclideanSpace(IndexedSeq(q0, q1, q2, q3)) with Symmetry with AntiSymmetry with Re with Im {

  val q: RThree = RThree(q1, q2, q3)

  def +(that: Quaternion): Quaternion = Quaternion(0 until dimensions map {i => this.elements(i) + that.elements(i) })

  def -(that: Quaternion): Quaternion = Quaternion(0 until dimensions map {i => this.elements(i) - that.elements(i) })

  def *(value: BigDecimal): Quaternion = Quaternion(0 until dimensions map {i => this.elements(i) * value })

  def *(that: Quaternion): Quaternion = {
    val q0 = this.q0
    val q = this.q

    val r0 = that.q0
    val r = that.q

    val s0: BigDecimal = (q0 * r0) - (q dot r)
    val s: RThree = (r * q0) + (q * r0) + (q x r)

    Quaternion(s0, s)
  }

  def conjugate: Quaternion = Quaternion(q0, MinusOne * q1, MinusOne * q2, MinusOne * q3)

  override def antisym(that: Quaternion): Quaternion = Quaternion(0, this.q x that.q)

  override def sym(that: Quaternion): Quaternion = {
    val q0 = this.q0
    val q = this.q

    val r0 = that.q0
    val r = that.q

    val s0 = (q0 * r0) - (q dot r)

    Quaternion(s0, (r * q0) + (q * r0))
  }

  override def re: BigDecimal = q0

  override def im: RThree = q


  def sbr: (J0, J1, J2, J3) = (J0(q0), J1(q1), J2(q2), J3(q3))

  override def toString: String = s"${sbr._1.toString}${sbr._2.toString}${sbr._3.toString}${sbr._4.toString}"

  def dot(that: Quaternion): BigDecimal = super.innerProduct(that).get
}

object Quaternion {
  val MinusOne = -1.0

  def apply(elements: IndexedSeq[BigDecimal]): Quaternion = new Quaternion(elements(0), elements(1), elements(2), elements(3))

  def apply(q0: BigDecimal, q: RThree): Quaternion = Quaternion(q0, q.x, q.y, q.z)
}