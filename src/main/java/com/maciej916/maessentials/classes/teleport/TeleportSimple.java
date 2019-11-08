package com.maciej916.maessentials.classes.teleport;

import com.maciej916.maessentials.classes.Location;
import net.minecraft.entity.player.ServerPlayerEntity;

import static com.maciej916.maessentials.libs.Methods.currentTimestamp;

public class TeleportSimple {

    private ServerPlayerEntity player;
    private Location destination;
    private String type;
    private long teleportTime;

    public TeleportSimple(ServerPlayerEntity player, Location destination, String type, long delay) {
        this.player = player;
        this.destination = destination;
        this.type = type;
        this.teleportTime = currentTimestamp() + delay;
    }

    public ServerPlayerEntity getPlayer() {
        return player;
    }

    public Location getDestination() {
        return destination;
    }

    public String getType() {
        return type;
    }

    public long getTeleportTime() {
        return teleportTime;
    }
}
