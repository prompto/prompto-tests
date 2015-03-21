define id as: Integer attribute 
define name as: Text attribute

define Company as: category with attributes: id and name

define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define printName as: method receiving: name doing:
	print with "name=" + name as value

define main as: method receiving: Text{} options doing:
	c = Company with 1 as id and "IBM" as name
	printName c