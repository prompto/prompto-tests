define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	print "/" + ('13:10:10' in ['13:10:10'..'13:10:11'])
	print "/" + ('13:10:10' in ['14:10:10'..'16:10:10'])
	