/*
 * Copyright © 2020 LambdAurora <aurora42lambda@gmail.com>
 *
 * This file is part of LambdaControls.
 *
 * Licensed under the MIT license. For more information,
 * see the LICENSE file.
 */

package me.lambdaurora.lambdacontrols.client.mixin;

import net.minecraft.advancement.Advancement;
import net.minecraft.client.gui.screen.advancement.AdvancementTab;
import net.minecraft.client.gui.screen.advancement.AdvancementsScreen;
import net.minecraft.client.network.ClientAdvancementManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

/**
 * Represents an accessor of {@link AdvancementsScreen}.
 */
@Mixin(AdvancementsScreen.class)
public interface AdvancementsScreenAccessor
{
    @Accessor("advancementHandler")
    ClientAdvancementManager lambdacontrols_getAdvancementManager();

    @Accessor("tabs")
    Map<Advancement, AdvancementTab> lambdacontrols_getTabs();

    @Accessor("selectedTab")
    AdvancementTab lambdacontrols_getSelectedTab();
}
