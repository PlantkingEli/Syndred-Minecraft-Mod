/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.syndred.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.syndred.SyndredMod;

@EventBusSubscriber
public class SyndredModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SyndredMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SYNDRED_TAB = REGISTRY.register("syndred_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.syndred.syndred_tab")).icon(() -> new ItemStack(SyndredModBlocks.ANIMA_CONFLUX.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SyndredModItems.RAW_SOULSTEEL.get());
				tabData.accept(SyndredModBlocks.ANIMA_CONFLUX.get().asItem());
				tabData.accept(SyndredModBlocks.DEEPSLATE_SPHALERITE_ORE.get().asItem());
				tabData.accept(SyndredModBlocks.SPHALERITE_ORE.get().asItem());
				tabData.accept(SyndredModItems.RAW_SPHALERITE.get());
				tabData.accept(SyndredModItems.SOULSTEEL_INGOT.get());
				tabData.accept(SyndredModItems.SPHALERITE_INGOT.get());
				tabData.accept(SyndredModBlocks.RAW_SOULSTEEL_BLOCK.get().asItem());
				tabData.accept(SyndredModBlocks.RAW_SPHALERITE_BLOCK.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSTEEL_ORE.get().asItem());
				tabData.accept(SyndredModBlocks.DEEPSLATE_SOULSTEEL_ORE.get().asItem());
				tabData.accept(SyndredModItems.ECHO_DUST.get());
				tabData.accept(SyndredModItems.SOULSTEEL_SHARD.get());
				tabData.accept(SyndredModItems.SOULSTEEL_SWORD.get());
				tabData.accept(SyndredModItems.SOULSTEEL_PICKAXE.get());
				tabData.accept(SyndredModItems.SOULSTEEL_AXE.get());
				tabData.accept(SyndredModItems.SOULSTEEL_SPADE.get());
				tabData.accept(SyndredModItems.SOULSTEEL_HOE.get());
				tabData.accept(SyndredModBlocks.SOULSTEEL_BLOCK.get().asItem());
				tabData.accept(SyndredModBlocks.SPHALERITE_BLOCK.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(SyndredModItems.SOULSTEEL_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SyndredModItems.SOULSTEEL_PICKAXE.get());
			tabData.accept(SyndredModItems.SOULSTEEL_AXE.get());
			tabData.accept(SyndredModItems.SOULSTEEL_SPADE.get());
			tabData.accept(SyndredModItems.SOULSTEEL_HOE.get());
		}
	}
}