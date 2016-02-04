package com.tpg.maths.rn

trait NDimensions {
  def elements: IndexedSeq[BigDecimal]

  lazy val dimensions: Int = elements.size

  def at(i: Int): BigDecimal = elements(i)
}
