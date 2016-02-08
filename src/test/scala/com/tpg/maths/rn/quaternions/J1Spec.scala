package com.tpg.maths.rn.quaternions

import org.scalatest.{FunSpec, Matchers}

class J1Spec extends FunSpec with Matchers {
  describe("A J1 basis element") {
    it("can be multiplied by itself") {
      val actual = J1 * J1
      actual should be (J1(-1))
    }

    it("can be multiplied by J0") {
      val actual = J1 * J0
      actual should be (J1)
    }

    it("can be multiplied by J2") {
      val actual = J1 * J2
      actual should be (J3)
    }

    it("can be multiplied by J3") {
      val actual = J1 * J3
      actual should be (J2(-1))
    }
  }
}
