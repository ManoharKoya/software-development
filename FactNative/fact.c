#include<stdio.h>
#include<jni.h>
#include "fact.h"

JNIEXPORT jint JNICALL Java_fact_factorial
  (JNIEnv *env, jobject obj, jint num){
      int f = 1;
      while(num>0) {
          f*=num;
          num--;
      }
      return f;
  }
