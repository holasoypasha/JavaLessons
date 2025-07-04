package ru.pavlova.lesson.entity;

/**
 *  Суть работы листа LinkedList
 */
public class Element {
    /**
     * Следующий элемент
     */
    private Element nextElement;
    /**
     * Названгие элемента
     */
    private String name;

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Element getNextElement() {
        return nextElement;
    }

    public void setNextElement(Element nextElement) {
        this.nextElement = nextElement;
    }

    public static void main(String[] args) {
        Element element = new Element("Элемент 1");
        Element element2 = new Element("Элемент 2");
        Element element3 = new Element("Элемент 3");
        element.setNextElement(element2);
        element2.setNextElement(element3);

        elName(element);

        Element element4 = null;
        elName(element4);

    }

    private static void elName(Element element) {
        if (element == null) {
            return;
        }
        System.out.println(element.getName());
        elName(element.getNextElement());
    }
}
