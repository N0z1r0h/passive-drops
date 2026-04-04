package n0z1r0h.pd.Registries;

import n0z1r0h.pd.PassiveDrops;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TabReg {
    public static final ResourceKey<CreativeModeTab> PD_TAB = ResourceKey.create(
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
            .build();

    Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, PD_TAB, PASSIVE_DROPS_TAB);
}
