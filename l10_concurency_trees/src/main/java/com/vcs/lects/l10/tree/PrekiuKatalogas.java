package com.vcs.lects.l10.tree;

import java.util.ArrayList;
import java.util.List;

public class PrekiuKatalogas {

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

		PrekiuKatalogas m = new PrekiuKatalogas();
		System.out.println("Search: " + m.searchItem(katalogas, " 		DAR			"));
		System.out.println();

		System.out.println("Count: " + m.countItems(katalogas, "c"));

		System.out.println("Search: " + m.searchAllElements(katalogas, "c"));

		System.out.println("Path: " + m.getCategoryPath(katalogas, "LeParfume"));

	}

	/**
	 * Suranda pirma pasitaikiusi elementa pagal paduota pavadinima
	 * 
	 * @param category   - kurioje sakoje ieskoma
	 * @param searchText - paieskos fraze
	 * @return pirmas surastas elementas
	 */
	public Element searchItem(Element category, String searchText) {

		if (isItContainsTheText(searchText, category.getName())) {
			return category;
		}

		for (Element childElement : category.getChilds()) {

			Element result = searchItem(childElement, searchText);
			if (result != null) {
				return result;
			}
		}

		return null;
	}

	/**
	 * Suskaiciuoja elementus pagal paieskos fraze
	 * 
	 * @param category   - kurioje sakoje ieskoma
	 * @param searchText - paieskos fraze
	 * @return kiekis
	 */
	public int countItems(Element category, String searchText) {
		int counter = (isItContainsTheText(searchText, category.getName()) ? 1 : 0);

		for (Element childElement : category.getChilds()) {
			counter += countItems(childElement, searchText);
		}
		return counter;
	}

	/**
	 * Suranda elementus pagal paieskos fraze
	 * 
	 * @param category   - kurioje sakoje ieskoma
	 * @param searchText - paieskos fraze
	 * @return elemntu sarasas
	 */
	public List<Element> searchAllElements(Element category, String searchText) {

		List<Element> list = new ArrayList<>();
		if (isItContainsTheText(searchText, category.getName())) {
			list.add(category);
		}

		for (Element childElement : category.getChilds()) {
			list.addAll(searchAllElements(childElement, searchText));

		}
		return list;
	}

	/**
	 * Grazina elemnto kategorijos kelia (path)
	 * 
	 * @param category   - kurioje sakoje ieskoma
	 * @param searchText - paieskos fraze
	 * @return kelias iki elemento
	 */
	public String getCategoryPath(Element category, String elementName) {

		String result = "";
		boolean found = category.getName().equals(elementName);

		if (found) {
			return category.getName();
		} else {
			for (Element childElement : category.getChilds()) {

				String childResult = getCategoryPath(childElement, elementName);
				if (!childResult.isEmpty()) {
					result += category.getName() + " > " + childResult;
				}

			}
		}

		return result;
	}

	private boolean isItContainsTheText(String searchText, String name) {
		return name.toLowerCase().contains(searchText.trim().toLowerCase());
	}

}
