package com.tpg.maths.rn.quaternions

import org.scalatest.{FunSpec, Matchers}

class J0Spec extends FunSpec with Matchers {
  describe("A J0") {
    it("can be multiplied by itself") {
      val actual = J0 * J0
      actual should be (J0)
    }

    it("can be multiplied by J1") {
      val actual = J0 * J1
      actual should be (J1)
    }

    it("can be multiplied by J2") {
      val actual = J0 * J2
      actual should be (J2)
    }

    it("can be multiplied by J3") {
      val actual = J0 * J3
      actual should be (J3)
    }
  }
}
