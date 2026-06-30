
void main() {
    Item item1 = new Item("uuid", "Apple", 500);
    Item item2 = new Item("uuid451", "Mac-book", 1500);

    SuiteCase suiteCase = new SuiteCase(10_000);
    suiteCase.add(item1);
    suiteCase.add(item2);

    System.out.println(suiteCase.getItems());
    System.out.println(suiteCase.getTotalWeight()+ " g");

    suiteCase.remove(item1.id());

    System.out.println("");

    System.out.println(suiteCase.getItems());
    System.out.println(suiteCase.getTotalWeight()+ " g");
}
