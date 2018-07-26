File eclipseVersion = new File("eclipseVersion.txt") 

String eclipseVersions = eclipseVersion.text

def mat = eclipseVersions =~/a href=\"\/downloads\/packages\/release\/.*?\">(.*?)<\/a><\/li>/ 

def out = new File("Actual.txt").newPrintWriter()

for(int i in 0..mat.size()-1){

	out.write(mat[i][1]+System.getProperty("line.separator"));
}

out.flush()

out.close()

File actualFile = new File("Actual.txt") 

String actualContents = actualFile.text

File expectFile = new File("ExpectedReleases.txt")

String expectContents = expectFile.text

assert actualContents == expectContents

