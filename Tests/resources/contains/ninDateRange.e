define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	print "/" + ('2012-10-10' not in ['2012-10-09'..'2012-10-11'])
	print "/" + ('2012-10-10' not in ['2013-10-10'..'2013-10-10'])
	