define name as: Text attribute
define text as: Text attribute

define Error as: enumerated category with attributes: name and text, with symbols:
	DIVIDE_BY_ZERO with "Divide by zero!" as text
	INDEX_OUT_OF_RANGE with "Index out of range!" as text
	NULL_REFERENCE with "Null reference!" as text

define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	switch on error doing:
		print "" + 1/0
	when DIVIDE_BY_ZERO:
		print error.text

