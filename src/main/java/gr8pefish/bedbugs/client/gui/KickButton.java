package gr8pefish.bedbugs.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;

@SideOnly(Side.CLIENT)
public class KickButton extends GuiButton {
    
    private ArrayList<String> tooltipLines = new ArrayList<>();

    public KickButton(int x, int y){
        super(2, x, y, 60, 20, I18n.format("bedbugs.kickButtonText"));
        this.tooltipLines.add(I18n.format("bedbugs.kickButtonTooltipLine1"));
        this.tooltipLines.add(I18n.format("bedbugs.kickButtonTooltipLine2"));
    }

    // Checks if the mouse is hovering over the button
    public boolean isMouseInButton(int mousePosX, int mousePosY){
        return (mousePosX >= this.x && mousePosY >= this.y && mousePosX < this.x + this.width && mousePosY < this.y + this.height);
    }

    public ArrayList<String> getTooltipLines() {
        return tooltipLines;
    }


}
