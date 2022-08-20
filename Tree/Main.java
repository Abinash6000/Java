class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode fruitJuice = new TreeNode("Fruit Juice");
        TreeNode coldDrink = new TreeNode("Cold Drink");

        TreeNode masalaChai = new TreeNode("Masala chai");
        TreeNode yellowTea = new TreeNode("Yelloe Tea");
        TreeNode rooibos = new TreeNode("Rooibos");
        TreeNode greenTea = new TreeNode("Green Tea");
        TreeNode blackTea = new TreeNode("Black Tea");
        TreeNode whiteTea = new TreeNode("White Tea");
        TreeNode oolongTea = new TreeNode("Oolong Tea");
        TreeNode herbalTea = new TreeNode("Herbal Tea");
        TreeNode puerTea = new TreeNode("Pu'er Tea");

        TreeNode cappuccino = new TreeNode("Cappuccino");
        TreeNode Espresso = new TreeNode("Espresso");
        TreeNode latte = new TreeNode("Latte");
        TreeNode americano = new TreeNode("Americano");
        TreeNode caffeMocha = new TreeNode("Caffe Mocha");
        TreeNode caffeMacchiato = new TreeNode("Caffe macchiato");
        TreeNode flatWhite = new TreeNode("Flat white");
        TreeNode affagato = new TreeNode("Affogato");
        TreeNode coldBrew = new TreeNode("Cold Brew");

        coffee.addChild(cappuccino);
        coffee.addChild(Espresso);
        coffee.addChild(latte);
        coffee.addChild(americano);
        coffee.addChild(caffeMacchiato);
        coffee.addChild(caffeMocha);
        coffee.addChild(flatWhite);
        coffee.addChild(affagato);
        coffee.addChild(coldBrew);

        TreeNode apple = new TreeNode("Apple Juice");
        TreeNode blueberry = new TreeNode("Blueberry Juice");
        TreeNode craneberry = new TreeNode("Craneberry Juice");
        TreeNode grape = new TreeNode("Grape Juice");
        TreeNode orange = new TreeNode("Orange Juice");
        TreeNode pineapple = new TreeNode("Pineapple Juice");
        TreeNode chocolate = new TreeNode("Chocolate Shake");
        TreeNode banana = new TreeNode("Banana Juice");

        fruitJuice.addChild(apple);
        fruitJuice.addChild(blueberry);
        fruitJuice.addChild(craneberry);
        fruitJuice.addChild(grape);
        fruitJuice.addChild(orange);
        fruitJuice.addChild(pineapple);
        fruitJuice.addChild(chocolate);
        fruitJuice.addChild(banana);

        TreeNode coca = new TreeNode("Coca-Cola");
        TreeNode pepsi = new TreeNode("Pepsi");
        TreeNode dietcoke = new TreeNode("Diet Coke");
        TreeNode drpepper = new TreeNode("Dr. Pepper");
        TreeNode mountaindew = new TreeNode("Mountain Dew");
        TreeNode sprite = new TreeNode("Sprite");
        TreeNode dietpepsi = new TreeNode("Diet Pepsi");
        TreeNode cokezero = new TreeNode("Coke Zero");

        coldDrink.addChild(coca);
        coldDrink.addChild(pepsi);
        coldDrink.addChild(dietcoke);
        coldDrink.addChild(drpepper);
        coldDrink.addChild(mountaindew);
        coldDrink.addChild(sprite);
        coldDrink.addChild(dietpepsi);
        coldDrink.addChild(cokezero);

        tea.addChild(masalaChai);
        tea.addChild(rooibos);
        tea.addChild(yellowTea);
        tea.addChild(greenTea);
        tea.addChild(blackTea);
        tea.addChild(whiteTea);
        tea.addChild(oolongTea);
        tea.addChild(herbalTea);
        tea.addChild(puerTea);

        hot.addChild(tea);
        hot.addChild(coffee);

        cold.addChild(fruitJuice);
        cold.addChild(coldDrink);

        drinks.addChild(hot);
        drinks.addChild(cold);

        System.out.println(drinks.print(0));
    }
}