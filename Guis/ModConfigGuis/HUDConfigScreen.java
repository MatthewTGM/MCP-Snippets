//ADD THIS TO LINES 88-91 (INBETWEEN `ScreenPosition pos = renderers.get(renderer);` and `renderer.renderDummy(pos);`)

	    if(renderer.renderBorder(true)) {
            	Gui.drawRect(pos.getAbsoluteX(), pos.getAbsoluteY(), pos.getAbsoluteX() + renderer.getWidth(), pos.getAbsoluteY() + renderer.getHeight(), new Color(199, 199, 0, 80).getRGB());
                this.drawHollowRect(pos.getAbsoluteX(), pos.getAbsoluteY(), renderer.getWidth(), renderer.getHeight(), new Color(199, 199, 0, 160).getRGB());
            }