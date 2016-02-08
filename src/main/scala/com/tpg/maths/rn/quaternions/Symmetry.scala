package com.tpg.maths.rn.quaternions

trait Symmetry {
  def sym(quaternion: Quaternion): Quaternion
}
