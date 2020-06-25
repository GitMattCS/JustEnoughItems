package mezz.jei.config;

public interface IIngredientFilterConfig {
	SearchMode getModNameSearchMode();

	SearchMode getTooltipSearchMode();

	SearchMode getTagSearchMode();

	SearchMode getCreativeTabSearchMode();

	SearchMode getColorSearchMode();

	SearchMode getResourceIdSearchMode();

	SearchMode getCraftableSearchMode();

	boolean getSearchAdvancedTooltips();
}
