# File differentiator
As an input program takes a file name with its extension. The goal is to decide, whether the given extension is consistent with the actual extension of the file. The program uses "magic numbers" (https://en.wikipedia.org/wiki/File_format#Magic_number) in order to determine it.

## Handled extensions
* .bmp
* .class
* .exe
* .gif
* .jpg
* .pdf
* .png
* .rar
* .txt

If extension isn't handled, program honestly states so (throwing an appropriate exception, one that fits this situation).
```
Exception in thread "main" file_differentiator.UnhandledExtensionException
	at file_differentiator.FileDifferentiator.checkIfExtensionIsHandled(FileDifferentiator.java:59)
	at file_differentiator.FileDifferentiator.differentiate(FileDifferentiator.java:32)
	at main.Main.main(Main.java:14)
```

## Usage example
At the beggining the program asks for the name of the file (preferably located in the project directory).

```
Input file name: 
```

### Correct extension

The input file name is "test.txt" and it is actually a .txt file.
```
Input file name: test.txt
```
In such case the output will be:
```
The extension is true
```

### Incorrect extension

The input file name is "test.png" but it is actually a .txt file.
```
Input file name: test.png
```
In such case the output will be:
```
Extension is .png, while actually it's a .txt.
