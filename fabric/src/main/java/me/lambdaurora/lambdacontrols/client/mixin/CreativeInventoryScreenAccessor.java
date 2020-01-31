/*
 * Copyright © 2020 LambdAurora <aurora42lambda@gmail.com>
 *
 * This file is part of LambdaControls.
 *
 * Licensed under the MIT license. For more information,
 * see the LICENSE file.
 */

package me.lambdaurora.lambdacontrols.client.mixin;

import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.container.Slot;
import net.minecraft.item.ItemGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

/**
 * Represents an accessor to CreativeInventoryScreen.
 */
@Mixin(CreativeInventoryScreen.class)
public interface CreativeInventoryScreenAccessor
{
    /**
     * Gets the selected tab.
     *
     * @return The selected tab index.
     */
    @Accessor("selectedTab")
    int lambdacontrols_getSelectedTab();

    /**
     * Sets the selected tab.
     *
     * @param group The tab's item group.
     */
    @Invoker("setSelectedTab")
    void lambdacontrols_setSelectedTab(@NotNull ItemGroup group);

    /**
     * Returns whether the slot belongs to the creative inventory or not.
     *
     * @param slot The slot to check.
     * @return True if the slot is from the creative inventory, else false.
     */
    @Invoker("isCreativeInventorySlot")
    boolean lambdacontrols_isCreativeInventorySlot(@Nullable Slot slot);
}
