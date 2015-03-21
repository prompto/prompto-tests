define isoCcy as: Text attribute in ["USD","GBP","EUR"] 

define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define printCcy as: method receiving: isoCcy doing:
	print "/ccy=" + isoCcy

define main as: method receiving: Text{} options doing:
	printCcy "USD"
	switch on error doing:
		printCcy "other"
	when any :
		print "/ok"
		
