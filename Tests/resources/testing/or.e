define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define "Or conditions" as: test method doing:
	a = 3
	b = 8
and expecting:
	a = 3 or b = 9
	
