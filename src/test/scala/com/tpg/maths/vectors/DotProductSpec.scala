package com.tpg.maths.vectors

import org.scalatest.{FunSpec, Matchers}

class DotProductSpec extends FunSpec with Matchers {
  describe("the dot product") {
    it ("calculates the dot product of two vectors of the same dimension") {
      val actual = DotProduct(Vector(2, -1, 5), Vector(-2, 0, -3))
      actual.innerProduct should be(Some(-19))
    }

    it ("cannot calculate the dot product of two vectors of different dimensions") {
      val actual = DotProduct(Vector(2, -1, 1, 1), Vector(-2, 0, -3))
      actual.innerProduct should be(None)
    }
  }
}
