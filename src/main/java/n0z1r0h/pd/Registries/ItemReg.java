package n0z1r0h.pd.Registries;

import n0z1r0h.pd.PassiveDrops;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.component.Consumable;

import java.util.function.Function;

public class ItemReg {
    public static <T extends Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {

        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PassiveDrops.MOD_ID,
                name));

        T item = itemFactory.apply(settings.setId(itemKey));

        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static final Item FUR = register("fur", Item::new,
            new Item.Properties()
                    .component(DataComponents.MAX_STACK_SIZE, 64)
    );
    public static final Item FROG_LEG = register("frog_leg", Item::new, new Item.Properties()
            .component(DataComponents.MAX_STACK_SIZE, 64)
            .food(new FoodProperties(2, 1.8F, false), new Consumable(1.6F, ItemUseAnimation.EAT, SoundEvents.GENERIC_EAT, true,
                    null))
    );
    public static final Item COOKED_FROG_LEG = register("cooked_frog_leg", Item::new, new Item.Properties()
            .component(DataComponents.MAX_STACK_SIZE, 64)
            .food(new FoodProperties(5, 6F, false), new Consumable(1.6F, ItemUseAnimation.EAT,
                    SoundEvents.GENERIC_EAT, true,
                    null))
    );

    public static void init() {}
}
