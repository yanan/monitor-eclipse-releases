File actualFile = new File("Actual.txt") 

String actualContents = actualFile.text

File expectFile = new File("Expected.txt")

String expectContents = expectFile.text

assert actualContents[48..-1] == expectContents
