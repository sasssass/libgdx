/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTriangle extends BulletBase {
	private long swigCPtr;
	
	protected btTriangle(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTriangle, normally you should not need this constructor it's intended for low-level usage. */ 
	public btTriangle(long cPtr, boolean cMemoryOwn) {
		this("btTriangle", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btTriangle obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btTriangle(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setVertex0(btVector3 value) {
    CollisionJNI.btTriangle_vertex0_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getVertex0() {
    long cPtr = CollisionJNI.btTriangle_vertex0_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setVertex1(btVector3 value) {
    CollisionJNI.btTriangle_vertex1_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getVertex1() {
    long cPtr = CollisionJNI.btTriangle_vertex1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setVertex2(btVector3 value) {
    CollisionJNI.btTriangle_vertex2_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getVertex2() {
    long cPtr = CollisionJNI.btTriangle_vertex2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setPartId(int value) {
    CollisionJNI.btTriangle_partId_set(swigCPtr, this, value);
  }

  public int getPartId() {
    return CollisionJNI.btTriangle_partId_get(swigCPtr, this);
  }

  public void setTriangleIndex(int value) {
    CollisionJNI.btTriangle_triangleIndex_set(swigCPtr, this, value);
  }

  public int getTriangleIndex() {
    return CollisionJNI.btTriangle_triangleIndex_get(swigCPtr, this);
  }

  public btTriangle() {
    this(CollisionJNI.new_btTriangle(), true);
  }

}
