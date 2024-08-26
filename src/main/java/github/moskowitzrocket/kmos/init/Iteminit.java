package github.moskowitzrocket.kmos.init;

import github.moskowitzrocket.kmos.KalesMod;
import github.moskowitzrocket.kmos.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class Iteminit {
    public static final Item EXAMPLE_ITEM = register("example_item", new Item(new Item.Settings()));
    public static final Item EXAMPLE_FOOD = register("example_food",
            new Item(new Item.Settings().food(FoodList.EXAMPLE_FOOD_SETTINGS).maxCount(16)));

    public static <T extends Item> T register(String name, T item){
        return Registry.register(Registries.ITEM, KalesMod.id(name) , item);
    }

    public static void load() {}
}
