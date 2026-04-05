package n0z1r0h.pd.Block;

import com.mojang.serialization.MapCodec;
import net.minecraft.references.BlockIds;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.SpreadingSnowyBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class GrassyDirt extends SpreadingSnowyBlock {
    public static final MapCodec<GrassyDirt> CODEC = simpleCodec(GrassyDirt::new);

    public MapCodec<? extends SpreadingSnowyBlock> codec() {
        return CODEC;
    }

    public GrassyDirt(final BlockBehaviour.Properties properties) {
        super(properties, BlockIds.DIRT);
    }
}
