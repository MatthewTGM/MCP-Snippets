package ga.matthewtgm.mods.impl;

import ga.matthewtgm.gui.hud.ScreenPosition;
import ga.matthewtgm.mods.ModConfig;
import ga.matthewtgm.mods.ModDraggable;
import net.minecraft.util.ResourceLocation;

public class ModMotionBlur extends ModDraggable {

	//public static boolean isEnabled = ModConfig.loadToggleFromFile("ModMotionBlur");
	
	@Override
	public int getWidth() {
		return font.getStringWidth("[Motion Blur Toggled]");
	}

	@Override
	public int getHeight() {
		return font.FONT_HEIGHT;
	}

	@Override
	public void render(ScreenPosition pos) {
		//if(isEnabled) {
			font.drawString("[Motion Blur Toggled]", pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
			mc.entityRenderer.loadShader(new ResourceLocation("shaders/post/blur.json"));
		//}
	}
}
