package com.tpg.maths.vectors


case class Vector(elements: IndexedSeq[BigDecimal]) {
  val dimension: Int = elements.size

  def +(that: Vector): Option[Vector] = if (that.dimension == this.dimension) { Some(add(that)) } else { None }

  private def add(that: Vector): Vector = Vector((0 until dimension) map { i => this.elements(i) + that.elements(i) })

  def -(that: Vector): Option[Vector] = if (that.dimension == this.dimension) { Some(subtract(that)) } else { None }

  private def subtract(that: Vector): Vector = Vector((0 until dimension) map { i => this.elements(i) - that.elements(i) })

  def *(value: BigDecimal) = Vector(this.elements map { e => e * value})

  def norm: BigDecimal = scala.math.pow((elements.map { e => e * e }).sum.toDouble, 0.5)
}

object Vector {
  def apply(values: BigDecimal*) : Vector = new Vector(values.toIndexedSeq)
}
