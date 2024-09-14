package net.shamos2000.halloweenmod.registrar;

import net.minecraftforge.eventbus.api.IEventBus;

public class RegistrarRegistrar {
    public static void register(IEventBus modEventBus) {
        ItemRegistrar.ITEMS.register(modEventBus);
    }
}
