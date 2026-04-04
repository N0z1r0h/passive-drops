package n0z1r0h.pd.Registries;

import n0z1r0h.pd.Item.FoodData;
import n0z1r0h.pd.PassiveDrops;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

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
    public static final Item RAW_FROG_LEG = register("raw_frog_leg", Item::new, new Item.Properties()
            .component(DataComponents.MAX_STACK_SIZE, 64)
            .food(FoodData.RAW_FROG_LEG)
    );
    public static final Item COOKED_FROG_LEG = register("cooked_frog_leg", Item::new, new Item.Properties()
            .component(DataComponents.MAX_STACK_SIZE, 64)
            .food(FoodData.COOKED_FROG_LEG)
    );









    /*public static final ResourceKey<CreativeModeTab> PD_TAB = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(),
            Identifier.fromNamespaceAndPath(
                    PassiveDrops.MOD_ID,
                    "pd_tab"
            )
    );

    public static final CreativeModeTab PASSIVE_DROPS_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ItemReg.FUR))
            .title(Component.translatable("creative_mode_tab.pd"))
            .displayItems((params, output) -> {
                output.accept(ItemReg.FUR);
                output.accept(ItemReg.RAW_FROG_LEG);
                output.accept(ItemReg.COOKED_FROG_LEG);
            })
            .build();*/


    public static void init() {}
}
