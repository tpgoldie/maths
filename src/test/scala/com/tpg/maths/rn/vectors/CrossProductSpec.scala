package com.tpg.maths.rn.vectors

import org.scalatest.{FunSpec, Matchers}

class CrossProductSpec extends FunSpec with Matchers {
  describe("the cross product") {
    it("calculates the cross product between two vectors in R3") {
      val actual = Vector(2, -1, 5) x Vector(-2, 0, -3)
      actual should be(Some(Vector(3, -4, -2)))
    }

    it("cannot calculate the cross product between vector a and b when b's dimension not 3") {
      val actual = Vector(2, -1, 5) x Vector(-2, 0, -3, 2)
      actual should be(None)
    }

    it("cannot calculate the cross product between vector a and b when a's dimension not 3") {
      val actual = Vector(2, -1) x Vector(-2, 0, -3)
      actual should be(None)
    }
  }
}
