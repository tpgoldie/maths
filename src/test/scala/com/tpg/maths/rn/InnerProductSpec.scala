package com.tpg.maths.rn

import com.tpg.maths.rn.vectors.Vector
import org.scalatest.{FunSpec, Matchers}

class InnerProductSpec extends FunSpec with Matchers {
  describe("the dot product") {
    it ("calculates the dot product of two R3 elements") {
      val actual = RThree(2, -1, 5) innerProduct RThree(-2, 0, -3)
      actual should be(Some(-19))
    }

    it ("calculates the dot product of two vectors of the same dimension") {
      val actual = Vector(2, -1, 5) innerProduct Vector(-2, 0, -3)
      actual should be(Some(-19))
    }

    it ("cannot calculate the dot product of vectors of different dimensions") {
      val actual = Vector(2, -1, 1, 1) innerProduct Vector(-2, 0, -3)
      actual should be(None)
    }
  }
}
