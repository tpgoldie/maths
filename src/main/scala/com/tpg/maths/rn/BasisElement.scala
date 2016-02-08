package com.tpg.maths.rn

abstract class BasisElement(value: EuclideanSpace, label: String) {
  protected def format(value: BigDecimal) : String = value >= 0 match {
    case true => {
      value == 0 match {
        case true => s" + ${value}"
        case false => s"${value}"
      }
    }

    case false => s" - ${value.abs}"
  }
}
