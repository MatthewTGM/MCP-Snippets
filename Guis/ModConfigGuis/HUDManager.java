//ADD THIS TO LINES 79-82 (INBETWEEN `renderer.render(pos)` AND `if(pos == null)`)

   		if(renderer.renderBorder()) {
			Gui.drawRect(pos.getAbsoluteX(), pos.getAbsoluteY(), pos.getAbsoluteX() + renderer.getWidth(), pos.getAbsoluteY() + renderer.getHeight(), new Color(199, 199, 0, 80).getRGB());
            		Utility.drawHollowRect(pos.getAbsoluteX(), pos.getAbsoluteY(), renderer.getWidth(), renderer.getHeight(), new Color(199, 199, 0, 160).getRGB());
		}
