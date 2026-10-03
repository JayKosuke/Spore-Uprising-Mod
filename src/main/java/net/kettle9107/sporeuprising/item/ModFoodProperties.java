package net.kettle9107.sporeuprising.item;

import com.Harbinger.Spore.core.Seffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoodProperties {
    public static final FoodProperties MEATYCARROTSTEW = new FoodProperties.Builder().nutrition(8).saturationModifier(0.35f).usingConvertsTo(Items.BOWL).effect(() -> new MobEffectInstance(Seffects.MYCELIUM, 200, 0), 0.75F).build();
}
