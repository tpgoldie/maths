package com.tpg.maths.rn.vectors

import com.tpg.maths.rn.RThree
import org.scalatest.{FunSpec, Matchers}

class CrossProductSpec extends FunSpec with Matchers {
  describe("the cross product") {
    it("calculates the cross product between two vectors in R3") {
      val actual = RThree(2, -1, 5) x RThree(-2, 0, -3)
      actual should be(RThree(3, -4, -2))
    }
  }
}
