package mezz.jei.gui.ingredients;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import mezz.jei.api.ingredients.IIngredientHelper;
import mezz.jei.api.ingredients.IIngredientRenderer;
import mezz.jei.config.IIngredientFilterConfig;
import mezz.jei.recipes.RecipeManager;

public interface IIngredientListElementInfo<V> {
	IIngredientHelper<V> getIngredientHelper();

	IIngredientRenderer<V> getIngredientRenderer();

	String getDisplayName();

	String getModNameForSorting();

	Set<String> getModNameStrings();

	List<String> getTooltipStrings(IIngredientFilterConfig config);

	List<String> getCraftableString(RecipeManager recipeManager);

	Collection<String> getTagStrings();

	Collection<String> getCreativeTabsStrings();

	Collection<String> getColorStrings();

	String getResourceId();

	IIngredientListElement<V> getElement();
}
