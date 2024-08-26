package github.moskowitzrocket.kmos.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent EXAMPLE_FOOD_SETTINGS = new FoodComponent.Builder()
            .nutrition(41)
            .saturationModifier(.3F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20*30, 1), 0.75F)
            .build();

}
