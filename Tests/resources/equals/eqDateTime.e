define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	print "/" + ('2012-10-10T08:30:00' = '2012-10-10T08:30:00')
	print "/" + ('2012-10-10T08:30:00' = '2012-10-11T08:30:01')
	print "/" + ('2012-10-10T08:30:00' = '2012-10-10')
	print "/" + ('2012-10-10T08:30:00' = '08:30:00')
	