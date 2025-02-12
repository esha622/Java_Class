package Assignment;

class Ingredient {
    private String name;

    public Ingredient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Recipe {
    private String title;
    private Ingredient ingredient1;
    private Ingredient ingredient2;

    public Recipe(String title, Ingredient ingredient1, Ingredient ingredient2) {
        this.title = title;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
    }

    public void display() {
        System.out.println("Recipe: " + title);
        System.out.println("1. " + ingredient1.getName());
        System.out.println("2. " + ingredient2.getName());
    }
}

class RecipeManager {
    private Recipe recipe1;
    private Recipe recipe2;

    public void addRecipe(Recipe recipe) {
        if (recipe1 == null) {
            recipe1 = recipe;
        } else if (recipe2 == null) {
            recipe2 = recipe;
        } else {
            System.out.println("Recipe manager is full.");
        }
    }

    public void displayAll() {
        if (recipe1 != null) recipe1.display();
        if (recipe2 != null) recipe2.display();
    }

    public static void main(String[] args) {
        RecipeManager manager = new RecipeManager();
        manager.addRecipe(new Recipe("Pasta", new Ingredient("Pasta"),new Ingredient("Tomato Sauce")));
        manager.addRecipe(new Recipe("Salad", new Ingredient("Lettuce"), new Ingredient("Olive Oil")));
        System.out.println("\nAll Recipes:");
        manager.displayAll();
    }
}