define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define name as: Text attribute

define Root as: category with attribute: name

define Parent as: Root

define Child as: Parent

define main as: method receiving: Text{} options doing:
	c = Parent with "ok" as name
	if c is a Root:
		print "/root:" + c.name
	if c is a Parent:
		print "/parent:" + c.name
	if c is a Child:
		print "/child:" + c.name
	