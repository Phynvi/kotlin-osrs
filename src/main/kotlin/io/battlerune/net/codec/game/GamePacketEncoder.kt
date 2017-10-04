package io.battlerune.net.codec.game

import io.battlerune.net.crypt.IsaacRandom
import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.MessageToByteEncoder

class GamePacketEncoder(val isaacRandom: IsaacRandom) : MessageToByteEncoder<GamePacket>() {

    override fun encode(ctx: ChannelHandlerContext, msg: GamePacket, out: ByteBuf) {

        val type = msg.type
        val payload = msg.payload

        out.writeByte(msg.opcode + isaacRandom.nextInt())

        if (type == PacketType.VARIABLE_BYTE) {
            out.writeByte(payload.writerIndex())
        } else if (type == PacketType.VARIABLE_SHORT) {
            out.writeShort(payload.writerIndex())
        }

        out.writeBytes(payload)

    }

}