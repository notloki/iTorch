package com.notloki.itorch.proxy;



import com.notloki.itorch.crafting.ModRecipes;
import com.notloki.itorch.util.RegisterUtil;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        RegisterUtil.registerAll(event);}
    public void init(FMLInitializationEvent event) {
        GameRegistry.addRecipe(ModRecipes.i_torch_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_blue_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_white_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_green_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_black_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_red_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_gray_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_lime_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_cyan_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_brown_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_purple_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_pink_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_orange_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_magenta_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_light_blue_shaped);
        GameRegistry.addRecipe(ModRecipes.i_torch_light_gray_shaped);

        GameRegistry.addRecipe(ModRecipes.i_torch_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_blue_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_white_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_green_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_black_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_red_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_gray_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_lime_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_cyan_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_brown_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_purple_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_pink_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_orange_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_magenta_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_light_blue_shapeless);
        GameRegistry.addRecipe(ModRecipes.i_torch_light_gray_shapeless);
    }
    public void postInit(FMLPostInitializationEvent event) {}
    public void serverStarting(FMLServerStartingEvent event) {}
    public void serverStopping(FMLServerStoppingEvent event) {}
}
