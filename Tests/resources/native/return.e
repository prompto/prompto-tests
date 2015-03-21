define systemName as: native method returning: Text doing:
	Java: return System.getProperty("os.name");
	C#: return System.Environment.MachineName;
	Python2: return sys.platform from module: sys
	Python3: return sys.platform from module: sys
	JavaScript: return os.type(); from module: os

define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	name = systemName
	print name
