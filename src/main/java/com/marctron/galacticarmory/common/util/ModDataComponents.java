package com.marctron.galacticarmory.common.util;


import java.util.function.UnaryOperator;

import com.marctron.galacticarmory.GalacticArmory;
import  com.marctron.galacticarmory.common.armor.materials.ArmorMaterial;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModDataComponents extends DataComponents {

    // Deferred register for data component types
    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_TYPES =
        DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, GalacticArmory.MODID);

    // Actual instance of the ArmorMaterial data component
    public static DataComponentType<ArmorMaterial> ARMOR_MATERIAL;

    // Registration method
    
    private static <T>DeferredHolder<DataComponentType<?>, DataComponentType<T>> register(String name, UnaryOperator<DataComponentType.Builder<T>> builderOperator) {
    	return DATA_COMPONENT_TYPES.register(name, () -> builderOperator.apply(DataComponentType.builder()).build());
}
    
    public static final DeferredHolder<DataComponentType<?>, DataComponentType<ArmorMaterial>> MATERIAL = register("material",
            builder -> builder.persistent(ArmorMaterial.CODEC));

    // Method to register the deferred register and event listener
    public static void registerToBus(IEventBus bus) {
        DATA_COMPONENT_TYPES.register(bus);
    }
}