package io.battlerune.game.event.impl

import io.battlerune.game.event.Event
import io.battlerune.game.world.actor.pawn.Player

class RegionChangeEvent(val player: Player) : Event