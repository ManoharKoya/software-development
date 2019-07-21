This is to run a c-programme from java file
1. create a java file and declare a native method.
2. In main method use the native method and compile it.
3. To create a header file use 

    javac -h . fact.java

4. Create a new c file and paste the native method decleration and 
   add argument variables to define your own function.
5. include stdio.h,jni.h and "fact.h"
6. compile command 

    gcc -I"%JAVA-HOME%\include" -I"%JAVA-HOME%\include\win32" -shared -o fact.dll fact.c

7. This will create a fact.dll shared library file 
8. Add a static block in fact class.

    System.loadLibrary("fact");
    
9. while running this java file will load fact.dll lib inorder to access fact() function in c file.
10. Comile and run fact.java
    