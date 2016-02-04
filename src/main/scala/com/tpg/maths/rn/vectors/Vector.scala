package com.tpg.maths.rn.vectors

import com.tpg.maths.rn.{EuclideanSpace, NDimensions}
import com.tpg.maths.rn.vectors.i._
import com.tpg.maths.rn.vectors.j._
import com.tpg.maths.rn.vectors.k._

case class Vector(override val elements: IndexedSeq[BigDecimal]) extends EuclideanSpace(elements) {
  def +(that: Vector): Option[Vector] = if (that.dimensions == this.dimensions) { Some(Vector(super.add(that))) } else { None }

  def -(that: Vector): Option[Vector] = if (that.dimensions == this.dimensions) { Some(Vector(subtract(that))) } else { None }

  def *(value: BigDecimal): Vector = Vector(multiplyBy(value))

  def x(that: Vector): Option[Vector] = CrossProduct(this, that).crossProduct

  def sbr: (i, j, k) = (elements(0), elements(1), elements(2))
}

object Vector {
  val R3StandardBasis: (i.type , j.type, k.type) = (i, j, k)

  def apply(values: BigDecimal*) : Vector = new Vector(values.toIndexedSeq)
}
