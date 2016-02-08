package com.tpg.maths.rn.quaternions

import org.scalatest.{FunSpec, Matchers}

class J3Spec extends FunSpec with Matchers {
  describe("A J3 basis element") {
    it("can be multiplied by itself") {
      val actual = J3 * J3
      actual should be (J0(-1))
    }

    it("can be multiplied by J0") {
      val actual = J3 * J0
      actual should be (J3)
    }

    it("can be multiplied by J1") {
      val actual = J3 * J1
      actual should be (J2)
    }

    it("can be multiplied by J2") {
      val actual = J3 * J2
      actual should be (J1(-1))
    }
  }
}
