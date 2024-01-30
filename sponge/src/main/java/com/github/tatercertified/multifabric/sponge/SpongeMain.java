package com.github.tatercertified.multifabric.sponge;

import com.google.inject.Inject;

import org.apache.logging.log4j.Logger;
import org.spongepowered.plugin.PluginContainer;
import org.spongepowered.plugin.builtin.jvm.Plugin;

/** Sponge entry point. */
@Plugin("multifabric")
public class SpongeMain {
    @Inject
    public SpongeMain(PluginContainer container, Logger logger) {
        // Stuff
    }
}
