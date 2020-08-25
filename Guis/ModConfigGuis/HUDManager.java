//ADD THIS TO LINES 79-82 (INBETWEEN `renderer.render(pos)` AND `if(pos == null)`)

    if(renderer.renderBorder() == true) {
			Gui.drawRect(pos.getAbsoluteX(), pos.getAbsoluteY(), pos.getAbsoluteX() + renderer.getWidth(), pos.getAbsoluteY() + renderer.getHeight(), renderer.borderBackgroundColor());
            Utility.drawHollowRect(pos.getAbsoluteX(), pos.getAbsoluteY(), renderer.getWidth(), renderer.getHeight(), renderer.borderColor());
		}
