/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class LinearMath implements LinearMathConstants {

	/** Temporary Vector3 instance, used by native methods that return a Vector3 instance */
	public final static Vector3 staticVector3 = new Vector3();
	/** Pool of Vector3, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Vector3> poolVector3 = new com.badlogic.gdx.utils.Pool<Vector3>() {
		@Override
		protected Vector3 newObject() {
			return new Vector3();
		}
	};


	/** Temporary Quaternion instance, used by native methods that return a Quaternion instance */
	public final static Quaternion staticQuaternion = new Quaternion();
	/** Pool of Quaternion, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Quaternion> poolQuaternion = new com.badlogic.gdx.utils.Pool<Quaternion>() {
		@Override
		protected Quaternion newObject() {
			return new Quaternion();
		}
	};


	/** Temporary Matrix3 instance, used by native methods that return a Matrix3 instance */
	public final static Matrix3 staticMatrix3 = new Matrix3();
	/** Pool of Matrix3, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Matrix3> poolMatrix3 = new com.badlogic.gdx.utils.Pool<Matrix3>() {
		@Override
		protected Matrix3 newObject() {
			return new Matrix3();
		}
	};


	/** Temporary Matrix4 instance, used by native methods that return a Matrix4 instance */
	public final static Matrix4 staticMatrix4 = new Matrix4();
	/** Pool of Matrix4, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Matrix4> poolMatrix4 = new com.badlogic.gdx.utils.Pool<Matrix4>() {
		@Override
		protected Matrix4 newObject() {
			return new Matrix4();
		}
	};

  public static int btGetVersion() {
    return LinearMathJNI.btGetVersion();
  }

  public static void setBtInfinityMask(int value) {
    LinearMathJNI.btInfinityMask_set(value);
  }

  public static int getBtInfinityMask() {
    return LinearMathJNI.btInfinityMask_get();
  }

  public static float btSqrt(float y) {
    return LinearMathJNI.btSqrt(y);
  }

  public static float btFabs(float x) {
    return LinearMathJNI.btFabs(x);
  }

  public static float btCos(float x) {
    return LinearMathJNI.btCos(x);
  }

  public static float btSin(float x) {
    return LinearMathJNI.btSin(x);
  }

  public static float btTan(float x) {
    return LinearMathJNI.btTan(x);
  }

  public static float btAcos(float x) {
    return LinearMathJNI.btAcos(x);
  }

  public static float btAsin(float x) {
    return LinearMathJNI.btAsin(x);
  }

  public static float btAtan(float x) {
    return LinearMathJNI.btAtan(x);
  }

  public static float btAtan2(float x, float y) {
    return LinearMathJNI.btAtan2(x, y);
  }

  public static float btExp(float x) {
    return LinearMathJNI.btExp(x);
  }

  public static float btLog(float x) {
    return LinearMathJNI.btLog(x);
  }

  public static float btPow(float x, float y) {
    return LinearMathJNI.btPow(x, y);
  }

  public static float btFmod(float x, float y) {
    return LinearMathJNI.btFmod(x, y);
  }

  public static float btAtan2Fast(float y, float x) {
    return LinearMathJNI.btAtan2Fast(y, x);
  }

  public static boolean btFuzzyZero(float x) {
    return LinearMathJNI.btFuzzyZero(x);
  }

  public static boolean btEqual(float a, float eps) {
    return LinearMathJNI.btEqual(a, eps);
  }

  public static boolean btGreaterEqual(float a, float eps) {
    return LinearMathJNI.btGreaterEqual(a, eps);
  }

  public static int btIsNegative(float x) {
    return LinearMathJNI.btIsNegative(x);
  }

  public static float btRadians(float x) {
    return LinearMathJNI.btRadians(x);
  }

  public static float btDegrees(float x) {
    return LinearMathJNI.btDegrees(x);
  }

  public static float btFsel(float a, float b, float c) {
    return LinearMathJNI.btFsel(a, b, c);
  }

  public static boolean btMachineIsLittleEndian() {
    return LinearMathJNI.btMachineIsLittleEndian();
  }

  public static long btSelect(long condition, long valueIfConditionNonZero, long valueIfConditionZero) {
    return LinearMathJNI.btSelect__SWIG_0(condition, valueIfConditionNonZero, valueIfConditionZero);
  }

  public static int btSelect(long condition, int valueIfConditionNonZero, int valueIfConditionZero) {
    return LinearMathJNI.btSelect__SWIG_1(condition, valueIfConditionNonZero, valueIfConditionZero);
  }

  public static float btSelect(long condition, float valueIfConditionNonZero, float valueIfConditionZero) {
    return LinearMathJNI.btSelect__SWIG_2(condition, valueIfConditionNonZero, valueIfConditionZero);
  }

  public static long btSwapEndian(long val) {
    return LinearMathJNI.btSwapEndian__SWIG_0(val);
  }

  public static int btSwapEndian(int val) {
    return LinearMathJNI.btSwapEndian__SWIG_1(val);
  }

  public static int btSwapEndian(short val) {
    return LinearMathJNI.btSwapEndian__SWIG_3(val);
  }

  public static long btSwapEndianFloat(float d) {
    return LinearMathJNI.btSwapEndianFloat(d);
  }

  public static float btUnswapEndianFloat(long a) {
    return LinearMathJNI.btUnswapEndianFloat(a);
  }

  public static void btSwapEndianDouble(double d, java.nio.ByteBuffer dst) {
    assert dst.isDirect() : "Buffer must be allocated direct.";
    {
      LinearMathJNI.btSwapEndianDouble(d, dst);
    }
  }

  public static double btUnswapEndianDouble(java.nio.ByteBuffer src) {
    assert src.isDirect() : "Buffer must be allocated direct.";
    {
      return LinearMathJNI.btUnswapEndianDouble(src);
    }
  }

  public static float btLargeDot(java.nio.FloatBuffer a, java.nio.FloatBuffer b, int n) {
    assert a.isDirect() : "Buffer must be allocated direct.";
    assert b.isDirect() : "Buffer must be allocated direct.";
    {
      return LinearMathJNI.btLargeDot(a, b, n);
    }
  }

  public static float btNormalizeAngle(float angleInRadians) {
    return LinearMathJNI.btNormalizeAngle(angleInRadians);
  }

  public static float btDot(Vector3 v1, Vector3 v2) {
    return LinearMathJNI.btDot(v1, v2);
  }

  public static float btDistance2(Vector3 v1, Vector3 v2) {
    return LinearMathJNI.btDistance2(v1, v2);
  }

  public static float btDistance(Vector3 v1, Vector3 v2) {
    return LinearMathJNI.btDistance(v1, v2);
  }

  public static float btAngle(Vector3 v1, Vector3 v2) {
    return LinearMathJNI.btAngle__SWIG_0(v1, v2);
  }

  public static Vector3 btCross(Vector3 v1, Vector3 v2) {
	return LinearMathJNI.btCross(v1, v2);
}

  public static float btTriple(Vector3 v1, Vector3 v2, Vector3 v3) {
    return LinearMathJNI.btTriple(v1, v2, v3);
  }

  public static Vector3 lerp(Vector3 v1, Vector3 v2, float t) {
	return LinearMathJNI.lerp(v1, v2, t);
}

  public static void btSwapScalarEndian(float sourceVal, SWIGTYPE_p_float destVal) {
    LinearMathJNI.btSwapScalarEndian(sourceVal, SWIGTYPE_p_float.getCPtr(destVal));
  }

  public static void btSwapVector3Endian(Vector3 sourceVec, Vector3 destVec) {
    LinearMathJNI.btSwapVector3Endian(sourceVec, destVec);
  }

  public static void btUnSwapVector3Endian(Vector3 vector) {
    LinearMathJNI.btUnSwapVector3Endian(vector);
  }

  public static float dot(Quaternion q1, Quaternion q2) {
    return LinearMathJNI.dot(q1, q2);
  }

  public static float length(Quaternion q) {
    return LinearMathJNI.length(q);
  }

  public static float btAngle(Quaternion q1, Quaternion q2) {
    return LinearMathJNI.btAngle__SWIG_1(q1, q2);
  }

  public static Quaternion inverse(Quaternion q) {
	return LinearMathJNI.inverse(q);
}

  public static Quaternion slerp(Quaternion q1, Quaternion q2, float t) {
	return LinearMathJNI.slerp(q1, q2, t);
}

  public static Vector3 quatRotate(Quaternion rotation, Vector3 v) {
	return LinearMathJNI.quatRotate(rotation, v);
}

  public static Quaternion shortestArcQuat(Vector3 v0, Vector3 v1) {
	return LinearMathJNI.shortestArcQuat(v0, v1);
}

  public static Quaternion shortestArcQuatNormalize2(Vector3 v0, Vector3 v1) {
	return LinearMathJNI.shortestArcQuatNormalize2(v0, v1);
}

  public static void AabbExpand(Vector3 aabbMin, Vector3 aabbMax, Vector3 expansionMin, Vector3 expansionMax) {
    LinearMathJNI.AabbExpand(aabbMin, aabbMax, expansionMin, expansionMax);
  }

  public static boolean TestPointAgainstAabb2(Vector3 aabbMin1, Vector3 aabbMax1, Vector3 point) {
    return LinearMathJNI.TestPointAgainstAabb2(aabbMin1, aabbMax1, point);
  }

  public static boolean TestAabbAgainstAabb2(Vector3 aabbMin1, Vector3 aabbMax1, Vector3 aabbMin2, Vector3 aabbMax2) {
    return LinearMathJNI.TestAabbAgainstAabb2(aabbMin1, aabbMax1, aabbMin2, aabbMax2);
  }

  public static boolean TestTriangleAgainstAabb2(btVector3 vertices, Vector3 aabbMin, Vector3 aabbMax) {
    return LinearMathJNI.TestTriangleAgainstAabb2(btVector3.getCPtr(vertices), vertices, aabbMin, aabbMax);
  }

  public static int btOutcode(Vector3 p, Vector3 halfExtent) {
    return LinearMathJNI.btOutcode(p, halfExtent);
  }

  public static boolean btRayAabb2(Vector3 rayFrom, Vector3 rayInvDirection, long[] raySign, btVector3 bounds, SWIGTYPE_p_float tmin, float lambda_min, float lambda_max) {
    return LinearMathJNI.btRayAabb2(rayFrom, rayInvDirection, raySign, btVector3.getCPtr(bounds), bounds, SWIGTYPE_p_float.getCPtr(tmin), lambda_min, lambda_max);
  }

  public static boolean btRayAabb(Vector3 rayFrom, Vector3 rayTo, Vector3 aabbMin, Vector3 aabbMax, SWIGTYPE_p_float param, Vector3 normal) {
    return LinearMathJNI.btRayAabb(rayFrom, rayTo, aabbMin, aabbMax, SWIGTYPE_p_float.getCPtr(param), normal);
  }

  public static void btTransformAabb(Vector3 halfExtents, float margin, Matrix4 t, Vector3 aabbMinOut, Vector3 aabbMaxOut) {
    LinearMathJNI.btTransformAabb__SWIG_0(halfExtents, margin, t, aabbMinOut, aabbMaxOut);
  }

  public static void btTransformAabb(Vector3 localAabbMin, Vector3 localAabbMax, float margin, Matrix4 trans, Vector3 aabbMinOut, Vector3 aabbMaxOut) {
    LinearMathJNI.btTransformAabb__SWIG_1(localAabbMin, localAabbMax, margin, trans, aabbMinOut, aabbMaxOut);
  }

  public static long testQuantizedAabbAgainstQuantizedAabb(java.nio.IntBuffer aabbMin1, java.nio.IntBuffer aabbMax1, java.nio.IntBuffer aabbMin2, java.nio.IntBuffer aabbMax2) {
    assert aabbMin1.isDirect() : "Buffer must be allocated direct.";
    assert aabbMax1.isDirect() : "Buffer must be allocated direct.";
    assert aabbMin2.isDirect() : "Buffer must be allocated direct.";
    assert aabbMax2.isDirect() : "Buffer must be allocated direct.";
    {
      return LinearMathJNI.testQuantizedAabbAgainstQuantizedAabb(aabbMin1, aabbMax1, aabbMin2, aabbMax2);
    }
  }

  public static void GEN_srand(long seed) {
    LinearMathJNI.GEN_srand(seed);
  }

  public static long GEN_rand() {
    return LinearMathJNI.GEN_rand();
  }

  public static Vector3 btAabbSupport(Vector3 halfExtents, Vector3 supportDir) {
	return LinearMathJNI.btAabbSupport(halfExtents, supportDir);
}

  public static void GrahamScanConvexHull2D(SWIGTYPE_p_btAlignedObjectArrayT_GrahamVector3_t originalPoints, SWIGTYPE_p_btAlignedObjectArrayT_GrahamVector3_t hull, Vector3 normalAxis) {
    LinearMathJNI.GrahamScanConvexHull2D(SWIGTYPE_p_btAlignedObjectArrayT_GrahamVector3_t.getCPtr(originalPoints), SWIGTYPE_p_btAlignedObjectArrayT_GrahamVector3_t.getCPtr(hull), normalAxis);
  }

  public static long btAlignedAllocInternal(long size, int alignment) {
    return LinearMathJNI.btAlignedAllocInternal(size, alignment);
  }

  public static void btAlignedFreeInternal(long ptr) {
    LinearMathJNI.btAlignedFreeInternal(ptr);
  }

  public static void btAlignedAllocSetCustom(SWIGTYPE_p_f_size_t__p_void allocFunc, SWIGTYPE_p_f_p_void__void freeFunc) {
    LinearMathJNI.btAlignedAllocSetCustom(SWIGTYPE_p_f_size_t__p_void.getCPtr(allocFunc), SWIGTYPE_p_f_p_void__void.getCPtr(freeFunc));
  }

  public static void btAlignedAllocSetCustomAligned(SWIGTYPE_p_f_size_t_int__p_void allocFunc, SWIGTYPE_p_f_p_void__void freeFunc) {
    LinearMathJNI.btAlignedAllocSetCustomAligned(SWIGTYPE_p_f_size_t_int__p_void.getCPtr(allocFunc), SWIGTYPE_p_f_p_void__void.getCPtr(freeFunc));
  }

  public static int getBT_HASH_NULL() {
    return LinearMathJNI.BT_HASH_NULL_get();
  }

}
