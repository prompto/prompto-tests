define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define checkIsNot as: method receiving: Text a and Text b doing:
	return a is not b
	
define main as: method receiving: Text{} options doing:
	a = "test"
	b = "test"
	print "/" + (checkIsNot with a as a and a as b)
	print "/" + (checkIsNot with a as a and b as b)
