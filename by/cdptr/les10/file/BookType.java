package by.cdptr.les10.file;

public enum BookType {

	BOOK("./src/by/cdptr/les10/file/Book.txt"), 
	NOVEL("./src/by/cdptr/les10/file/Novel.txt");

	private String filePath;

	public String getFilePath() {
		return this.filePath;
	}

	private BookType(String filePath) {
		this.filePath = filePath;
	}

}
