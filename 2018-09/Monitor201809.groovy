File version201809 = new File("2018-09.txt") 

String Versions201809 = version201809.text

def mat = Versions201809 =~/a href=\"\/downloads\/packages\/release\/2018-09\/.*?\">(.*?)Packages<\/a><\/li>/ 

def out = new File("Actual.txt").newPrintWriter()

for(int i in 0..mat.size()-1){

	out.write(mat[i][1]+System.getProperty("line.separator"));
}

out.flush()

out.close()

File actualFile = new File("Actual.txt") 

String actualContents = actualFile.text

File expectFile = new File("Expected201809.txt")

String expectContents = expectFile.text

assert actualContents == expectContents

