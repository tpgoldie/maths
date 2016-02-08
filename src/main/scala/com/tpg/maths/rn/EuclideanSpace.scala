package com.tpg.maths.rn

import com.tpg.maths.rn.ops.Norm

abstract class EuclideanSpace(override val elements: IndexedSeq[BigDecimal]) extends NDimensions with Norm {
  type T = EuclideanSpace

  protected def add(that: EuclideanSpace): IndexedSeq[BigDecimal] = (0 until dimensions) map { i => this.elements(i) + that.elements(i) }

  protected def subtract(that: EuclideanSpace): IndexedSeq[BigDecimal] = (0 until dimensions) map { i => this.elements(i) - that.elements(i) }

  protected def multiplyBy(value: BigDecimal): IndexedSeq[BigDecimal] = elements map { e => e * value }

  override def innerProduct(that: EuclideanSpace): Option[BigDecimal] = {
    if (this.dimensions == that.dimensions) {
      val temp = 0 until this.dimensions map { i => this.at(i) * that.at(i) }
      Some(temp.sum)
    }
    else {
      None
    }
  }


  def norm: BigDecimal = scala.math.pow((elements.map { e => e * e }).sum.toDouble, 0.5)
}
