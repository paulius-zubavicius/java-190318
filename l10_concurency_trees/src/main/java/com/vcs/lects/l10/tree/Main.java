package com.vcs.lects.l10.tree;

public class Main {

	public static void main(String[] args) {

		/**
		 * Ukines
		 */

		Element vokiski = new Element("Vokiski", new Element("Gooten clear"), new Element("Fertxcdzasd"));
		Element lePrancuziski = new Element("LePrancuziskas", new Element("Parfume clean"),
				new Element("LeEifel clean"), new Element("LeParfume"));

		Element valikliai = new Element("Valikliai", vokiski, lePrancuziski);
		Element balikliai = new Element("Balikliai", new Element("Vanish"), new Element("Baltuoklis"));
		Element chemija = new Element("Chemija", new Element("Cezis"), new Element("Radis"), new Element("Boras"));

		Element ukines = new Element("Ukines", new Element("Buitine chemija", valikliai, balikliai, chemija));

		/**
		 * Laisvailaikio
		 */
		Element lauko = new Element("Lauko", new Element("Slides"), new Element("Dviratis"), new Element("Meskere"));
		Element vidaus = new Element("Vidaus", new Element("Stalo futbolas"), new Element("Dartai"));

		Element laisvaliakio = new Element("Laisvaliakis", lauko, vidaus);

		/**
		 * Statybines
		 */
		Element staybines = new Element("Statybines", new Element("Cementas"));

		/**
		 * Katalogas (root)
		 * 
		 */
		Element katalogas = new Element("Prekes", ukines, staybines, laisvaliakio, new Element("Atvezimo paslauga"));

		Main m = new Main();
		System.out.println("Search: " + m.searchItem(katalogas, " 		DAR			"));
		System.out.println();

		System.out.println("Count: " + m.countItems(katalogas, "al"));

	}

	public int countItems(Element element, String searchText) {

		// TODO
		return 0;
	}

	public Element searchItem(Element element, String searchText) {

		if (isItContainsTheText(searchText, element.getName())) {
			return element;
		}

		for (Element childElement : element.getChilds()) {

			Element result = searchItem(childElement, searchText);
			if (result != null) {
				return result;
			}
		}

		return null;
	}

	private boolean isItContainsTheText(String searchText, String name) {
		return name.toLowerCase().contains(searchText.trim().toLowerCase());
	}

}
