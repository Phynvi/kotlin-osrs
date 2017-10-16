package io.battlerune.game.world.actor.pawn.player.block

import io.battlerune.game.world.actor.pawn.player.Player
import io.battlerune.game.world.actor.pawn.update.PlayerUpdateBlock
import io.battlerune.game.world.actor.pawn.update.UpdateFlag
import io.battlerune.net.codec.game.RSByteBufWriter

class PlayerContextMenuUpdateBlock : PlayerUpdateBlock(0x100, UpdateFlag.PLAYER_CONTEXT_MENU) {

    override fun encode(pawn: Player, buffer: RSByteBufWriter) {
        // TODO
    }

}