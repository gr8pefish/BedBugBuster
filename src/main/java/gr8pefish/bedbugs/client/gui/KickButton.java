package gr8pefish.bedbugs.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;

@SideOnly(Side.CLIENT)
public class KickButton extends GuiButton {

    //ToDo: Add tooltip?
    private ArrayList<String> tooltipLines = new ArrayList<>();

    public KickButton(int x, int y){
        super(2, x, y, 40, 20, I18n.format("bedbugs.kickButtonText")); //mojang code
        this.tooltipLines.clear();
        this.tooltipLines.add(I18n.format("bedbugs.kickButtonTooltipLine1"));
        this.tooltipLines.add(I18n.format("bedbugs.kickButtonTooltipLine2"));
    }

    public boolean isMouseInButton(int mousePosX, int mousePosY){
        return (mousePosX >= this.xPosition && mousePosY >= this.yPosition && mousePosX < this.xPosition + this.width && mousePosY < this.yPosition + this.height);
    }

    public ArrayList<String> getTooltipLines() {
        return tooltipLines;
    }


}
