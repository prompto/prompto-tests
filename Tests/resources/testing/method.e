define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define Smaller as: method receiving: Integer i1 and Integer i2 doing:
	return i1 < i2
	
define "Method" as: test method doing:
	a = 3
	b = 8
and expecting:
	Smaller with a as i1 and b as i2

