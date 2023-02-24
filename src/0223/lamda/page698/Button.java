package lamda.page698;

public class Button {
	@FunctionalInterface
	public static interface ClickListener{
		void onClick();
	}
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	public void click() {
		this.clickListener.onClick();
	}
	private ClickListener clickListener;
	
}
