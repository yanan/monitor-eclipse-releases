File photonVersion = new File("PhotonVersion.txt") 

String PhotonVersions = photonVersion.text

def mat = PhotonVersions =~/a href=\"\/downloads\/packages\/release\/photon\/.*?\">(.*?)<\/a><\/li>/ 

def out = new File("Actual.txt").newPrintWriter()

for(int i in 0..mat.size()-1){

	out.write(mat[i][1]+System.getProperty("line.separator"));
}

out.flush()

out.close()

File actualFile = new File("Actual.txt") 

String actualContents = actualFile.text

File expectFile = new File("ExpectedPhotons.txt")

String expectContents = expectFile.text

assert actualContents == expectContents

