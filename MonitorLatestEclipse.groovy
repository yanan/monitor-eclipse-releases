File eclipseVersion = new File("eclipseVersion.txt") 

String eclipseVersions = eclipseVersion.text

def mat = eclipseVersions =~/a href=\"http:\/\/www.eclipse.org\/downloads\/packages\/release\/.*?\">(.*?)<\/a><\/span>/ 

def out = new File("Versions.txt").newPrintWriter()

for(int i in 0..mat.size()-1){

	out.write(mat[i][1]+System.getProperty("line.separator"));
}

out.flush()

out.close()

File actualFile = new File("Versions.txt") 

String actualContents = actualFile.text

File expectFile = new File("Excepted.txt")

String expectContents = expectFile.text

assert actualContents == expectContents
