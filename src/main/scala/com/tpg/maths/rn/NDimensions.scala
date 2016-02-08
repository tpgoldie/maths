package com.tpg.maths.rn

import com.tpg.maths.rn.ops.InnerProduct

trait NDimensions extends InnerProduct {
  def elements: IndexedSeq[BigDecimal]

  lazy val dimensions: Int = elements.size

  def at(i: Int): BigDecimal = elements(i)
}
