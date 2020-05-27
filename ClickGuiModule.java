//Deobf by NOctu (je l'ai peut être mm améliorer lmao)
public class ClickGuiModule extends Module {
    private ClickGui clickGui;
    final public static boolean trigger1;
    
    public ClickGuiModule() {
        super("ClickGui", Keyboard.RSHIFT, true, Category.Misc);
    }
    
    protected void onToggle() {
        if (this.clickGui == null) {
            this.clickGui = new ClickGui();
        }
        mc.displayGuiScreen(this.clickGui);
        this.toggle();
        this.onToggle();
    }
}
