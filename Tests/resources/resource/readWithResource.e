define path as: Text attribute

define File as: native resource with attribute: path, and mappings:

	define category mappings as:
		Java: presto.runtime.utils.MyResource
		C#: presto.runtime.utils.MyResource
		Python2: MyResource from module: presto.runtime.utils.MyResource
		Python3: MyResource from module: presto.runtime.utils.MyResource
		JavaScript: MyResource from module: test/user/MyResource.js

define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	with file = File with "xyz" as path, do:
		s = read from file
		print s