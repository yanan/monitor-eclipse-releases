File version201912 = new File("2019-12.txt") 

String Versions201912 = version201912.text

def mat = Versions201912 =~/a href=\"\/downloads\/packages\/release\/2019-12\/.*?\">(.*?)Packages<\/a><\/li>/ 

def out = new File("Actual.txt").newPrintWriter()

for(int i in 0..mat.size()-1){

	out.write(mat[i][1]+System.getProperty("line.separator"));
}

out.flush()

out.close()

File actualFile = new File("Actual.txt") 

String actualContents = actualFile.text

File expectFile = new File("Expected201912.txt")

String expectContents = expectFile.text

assert actualContents == expectContents

