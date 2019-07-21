#include<jni.h>
#include<stdio.h>
#include "HelloJNI.h"

JNIEXPORT void JNICALL Java_HelloJNI_sayHello(JNIEnv *env, jobject thisObj) {
   printf("Hello mk!");
   return;
}
int main(){
    Java_HelloJNI_sayHello();
    return 0;
}