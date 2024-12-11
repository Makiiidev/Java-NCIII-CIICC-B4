package TaskSheets;

public class Task131 {
    public static void main(String[] args) {
        Afritada meal1 = new Afritada();
        Afritada meal2 = new Mechado();
        Afritada meal3 = new Menudo();
        Afritada meal4 = new Caldereta();

        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}

class Afritada {
    public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce", "Meat"};
        System.out.println("Afritada = " + java.util.Arrays.toString(Ingredients) + "\n");
    }
}

class Caldereta extends Afritada {
    public void showIngredients() {
        String[] Ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Tomato Paste",
            "Liver Spread",
            "Raisins",
            "Hotdog",
            "Siling Labuyo",
            "Cheese"
        };
        System.out.println("Caldereta = " + java.util.Arrays.toString(Ingredients) + "\n");
    }
}

class Menudo extends Afritada {
    public void showIngredients() {
        String[] Ingredients = {
            "Tomato Sauce",
            "Meat",
            "Liver",
            "Potatoes",
            "Carrots",
            "Hotdog",
            "Raisins"
        };
        System.out.println("Menudo = " + java.util.Arrays.toString(Ingredients) + "\n");
    }
}

class Mechado extends Afritada {
    public void showIngredients() {
        String[] Ingredients = {
            "Tomato Sauce",
            "Beef",
            "Carrots",
            "Potatoes",
            "Garlic",
            "Onions",
            "Bell Peppers",
            "Vinegar",
            "Soy Sauce"
        };
        System.out.println("Mechado = " + java.util.Arrays.toString(Ingredients) + "\n");
    }
}

