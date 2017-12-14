.class public sample2
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; bitvecArray:array

.field private static bitvecArray [Z

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        sample2/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        sample2/_standardIn LPascalTextIn;

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("======Testing RunTime Library=====")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "======Testing RunTime Library====="
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("The RunTime Library will allow the user to declare")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "The RunTime Library will allow the user to declare"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("An array and set a string equal to it. The string will")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "An array and set a string equal to it. The string will"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("Be the name of a text file that the user wishes to begin to")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Be the name of a text file that the user wishes to begin to"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("encrypt. The RunTime Library functions called from that assignment")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "encrypt. The RunTime Library functions called from that assignment"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("will print out what the input file was. Convert it to a BitVector and")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "will print out what the input file was. Convert it to a BitVector and"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("print out the corresponding BitVector. That BitVector is then stored into the")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "print out the corresponding BitVector. That BitVector is then stored into the"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("array that the file was assigned to.")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "array that the file was assigned to."
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; bitvecArray:="inputBitVec.txt"

	ldc 200
	newarray boolean
	putstatic sample2/bitvecArray [Z

	new importChar
	dup
	invokespecial importChar/<init>()V
	ldc "inputBitVec.txt"
	invokevirtual importChar.IMPORT(Ljava/lang/String;)Ljava/lang/String;
	astore_3
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload_3
	invokevirtual    java/io/PrintStream/println(Ljava/lang/String;)V
	new BVector
	dup
	invokespecial BVector/<init>()V
	astore_1
	aload_1
	aload_3
	invokevirtual BVector.add_String(Ljava/lang/String;)V
	aload_1
	invokevirtual BVector.print()V
	aload_1
	invokevirtual BVector.ReturnBV()[Z

	putstatic	sample2/bitvecArray [Z

; 


	getstatic     sample2/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
