//ADD THIS TO LINES 33-36 (INBETWEEN THE SAVE AND GETFOLDER METHODS)

	@Override
	public int borderColor() {
		return new Color(199, 199, 0, 80).getRGB();
	}
	
	@Override
	public int borderBackgroundColor() {
		return new Color(199, 199, 0, 160).getRGB();
	}
	
	@Override
	public boolean renderBorder() {
		return false;
	}
