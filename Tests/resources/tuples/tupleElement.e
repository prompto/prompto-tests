define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	s = ( 1, "John", '12:12:12' )
	print "/s[1]=" + s[1]
	print "/s[2]=" + s[2]
	print "/s[3]=" + s[3]
	