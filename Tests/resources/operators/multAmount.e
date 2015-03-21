define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define currency as: Text attribute matching "[A-Z]{3}" 
define value as: Decimal attribute

define Amount as: category with attributes: currency and value, and methods:

	define * as: operator receiving: Integer i doing:
		return Amount with currency as currency and value * i as value
	
define main as: method receiving: Text{} options doing:
	a = Amount with "USD" as currency and 2000.0 as value
	b = 2 * a * 3
	print "" + b
	