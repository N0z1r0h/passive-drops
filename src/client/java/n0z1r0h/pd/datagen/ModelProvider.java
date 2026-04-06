package n0z1r0h.pd.datagen;

import n0z1r0h.pd.Registries.BlockReg;
import n0z1r0h.pd.Registries.ItemReg;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.createTrivialCube(BlockReg.DIRTY_COBBLESTONE);
       //  blockStateModelGenerator.createTrivialBlock(BlockReg.STONE_PILLAR, TexturedModel.COLUMN_ALT);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(ItemReg.RAW_FROG_LEG, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ItemReg.COOKED_FROG_LEG, ModelTemplates.FLAT_ITEM);
    }

    @Override
    public String getName() {
        return "ModelProvider";
    }
}
