package mods.letsmodreboot.item.tools.ToolAbstracts;

import mods.letsmodreboot.reference.ToolsReference;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

abstract public class ItemShovelLMRB extends ToolLMRB
{
    public ItemShovelLMRB(ToolMaterial material)
    {
        super(0, material, ToolsReference.shovelBlocksEffectiveAgainst);
    }

    @Override
    public boolean canHarvestBlock(Block block, ItemStack stack)
    {
        if(block == Blocks.snow)
        {
            return true;
        }

        return block == Blocks.snow;
    }

}
