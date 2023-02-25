package org.subtoqz.autoplacephantomblocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.subtoqz.autoplacephantomblocks.AutoPlacePhantomBlocks;

public class ModItemGroups {
    public static final ItemGroup CHROMAKEY_GROUP = FabricItemGroup.builder(new Identifier(AutoPlacePhantomBlocks.MOD_ID, "chromakey_group")).icon(() -> new ItemStack(ModItems.CHROMAKEY_CANVAS)).build();
}