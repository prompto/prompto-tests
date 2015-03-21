define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	t1 = ( 'a', 1 )
	t2 = ( 'b', 2 )
	for each t in [t1,t2]:
		print "/t[1]=" + t[1] + "/t[2]=" + t[2]