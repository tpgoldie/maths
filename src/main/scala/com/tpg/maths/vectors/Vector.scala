package com.tpg.maths.vectors

import com.tpg.maths.vectors.i._
import com.tpg.maths.vectors.j._
import com.tpg.maths.vectors.k._

case class Vector(elements: IndexedSeq[BigDecimal]) {
  val dimension: Int = elements.size

  def at(i: Int): BigDecimal =  elements(i)

  def +(that: Vector): Option[Vector] = if (that.dimension == this.dimension) { Some(add(that)) } else { None }

  private def add(that: Vector): Vector = Vector((0 until dimension) map { i => this.elements(i) + that.elements(i) })

  def -(that: Vector): Option[Vector] = if (that.dimension == this.dimension) { Some(subtract(that)) } else { None }

  private def subtract(that: Vector): Vector = Vector((0 until dimension) map { i => this.elements(i) - that.elements(i) })

  def *(value: BigDecimal): Vector = Vector(this.elements map { e => e * value})

  def x(that: Vector): Option[Vector] = CrossProduct(this, that).crossProduct

  def dot(that: Vector): Option[BigDecimal] = DotProduct(this, that).innerProduct

  def norm: BigDecimal = scala.math.pow((elements.map { e => e * e }).sum.toDouble, 0.5)

  def sbr: (i, j, k) = (elements(0), elements(1), elements(2))
}

object Vector {
  val R3StandardBasis: (i.type , j.type, k.type) = (i, j, k)

  def apply(values: BigDecimal*) : Vector = new Vector(values.toIndexedSeq)
}
