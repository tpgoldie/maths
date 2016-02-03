package com.tpg.maths.vectors

import org.scalatest.{FunSpec, Matchers}

class DotProductSpec extends FunSpec with Matchers {
  describe("the dot product") {
    it ("calculates the dot product of two vectors of the same dimension") {
      val actual = Vector(2, -1, 5) dot Vector(-2, 0, -3)
      actual should be(Some(-19))
    }

    it ("cannot calculate the dot product of vectors of different dimensions") {
      val actual = Vector(2, -1, 1, 1) dot Vector(-2, 0, -3)
      actual should be(None)
    }
  }
}
