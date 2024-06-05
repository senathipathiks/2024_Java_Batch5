package ClassAndObject;


interface Searchable {
	void search(String keyword);
}


class Document implements Searchable {
	private String content;

	public Document(String content) {
		this.content = content;
	}

	
	public void search(String keyword) {
		if (content.contains(keyword)) {
			System.out.println("Keyword '" + keyword + "' found in the document.");
		} else {
			System.out.println("Keyword '" + keyword + "' not found in the document.");
		}
	}
}

class WebPage implements Searchable {
	private String htmlContent;

	public WebPage(String htmlContent) {
		this.htmlContent = htmlContent;
	}

	
	public void search(String keyword) {
		if (htmlContent.contains(keyword)) {
			System.out.println("Keyword '" + keyword + "' found in the web page.");
		} else {
			System.out.println("Keyword '" + keyword + "' not found in the web page.");
		}
	}
}

public class SearchableDemo {
	public static void main(String[] args) {
		
		Document doc = new Document("This is a sample document containing some text.");
		WebPage webPage = new WebPage("<html><body>This is a sample web page.</body></html>");

		doc.search("sample");
		webPage.search("web page");
	}
}
