package com.tpg.maths.rn

abstract class EuclideanSpace(override val elements: IndexedSeq[BigDecimal]) extends NDimensions {
  protected def add(that: EuclideanSpace): IndexedSeq[BigDecimal] = (0 until dimensions) map { i => this.elements(i) + that.elements(i) }

  protected def subtract(that: EuclideanSpace): IndexedSeq[BigDecimal] = (0 until dimensions) map { i => this.elements(i) - that.elements(i) }

  protected def multiplyBy(value: BigDecimal): IndexedSeq[BigDecimal] = elements map { e => e * value }

  def dot[T <: EuclideanSpace](that: T): Option[BigDecimal] = DotProduct(this, that).innerProduct

  def norm: BigDecimal = scala.math.pow((elements.map { e => e * e }).sum.toDouble, 0.5)
}
