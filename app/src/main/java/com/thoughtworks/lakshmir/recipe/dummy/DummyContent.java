package com.thoughtworks.lakshmir.recipe.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample recipe for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyRecipe> RECIPES = new ArrayList<DummyRecipe>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyRecipe> RECIPE_MAP = new HashMap<String, DummyRecipe>();

    static {
        // Add 3 sample items.
        HashMap<String, String> recipe1 = createRecipeMap("Recipe 1", "This is a description for the first recipe");
        HashMap<String, String> recipe2 = createRecipeMap("Recipe 2", "This is a description for the second recipe");
        HashMap<String, String> recipe3 = createRecipeMap("Recipe 3", "This is a description for the third recipe");
        addRecipe(new DummyRecipe("1", recipe1));
        addRecipe(new DummyRecipe("2", recipe2));
        addRecipe(new DummyRecipe("3", recipe3));
    }

    private static HashMap<String, String> createRecipeMap(String name, String description) {
        HashMap<String, String> recipe1 = new HashMap<String, String>();
        recipe1.put("Name", name);
        recipe1.put("Description", description);
        return recipe1;
    }

    private static void addRecipe(DummyRecipe recipe) {
        RECIPES.add(recipe);
        RECIPE_MAP.put(recipe.id, recipe);
    }

    /**
     * A dummy item representing a piece of recipe.
     */
    public static class DummyRecipe {
        public String id;
        public HashMap<String, String> recipe;

        @Override
        public String toString() {
            return recipe.get("Name");
        }

        public DummyRecipe(String id, HashMap<String, String> recipe) {
            this.id = id;
            this.recipe = recipe;
        }
    }


}
