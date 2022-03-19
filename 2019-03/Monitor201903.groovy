File version201903 = new File("2019-03.txt") 

String Versions201903 = version201903.text

def mat = Versions201903 =~/a href=\"\/downloads\/packages\/release\/2019-03\/.*?\">(.*?)Packages<\/a><\/li>/ 

def out = new File("Actual.txt").newPrintWriter()

for(int i in 0..mat.size()-1){

	out.write(mat[i][1]+System.getProperty("line.separator"));
}

out.flush()

out.close()

File actualFile = new File("Actual.txt") 

String actualContents = actualFile.text

File expectFile = new File("Expected201903.txt")

String expectContents = expectFile.text

assert actualContents == expectContents

