File version202003 = new File("2020-06.txt") 

String Versions202003 = version202003.text

def mat = Versions202003 =~/a href=\"\/downloads\/packages\/release\/2020-06\/.*?\">(.*?)Packages<\/a><\/li>/ 

def out = new File("Actual.txt").newPrintWriter()

for(int i in 0..mat.size()-1){

	out.write(mat[i][1]+System.getProperty("line.separator"));
}

out.flush()

out.close()

File actualFile = new File("Actual.txt") 

String actualContents = actualFile.text

File expectFile = new File("Expected202006.txt")

String expectContents = expectFile.text

assert actualContents == expectContents

