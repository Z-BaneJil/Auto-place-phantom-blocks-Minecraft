package org.subtoqz.autophantomblocks.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.subtoqz.autophantomblocks.AutoPhantomBlocks;

public class ModItemGroups {
    public static final ItemGroup FIRST_GROUP = FabricItemGroupBuilder.create(new Identifier(AutoPhantomBlocks.MOD_ID, "phantom_group")).icon(() -> new ItemStack(ModItems.FIRST_ITEM)).build();
}