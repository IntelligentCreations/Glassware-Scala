package dev.intelligentcreations.glassware.common.block.base

import net.minecraft.world.item.DyeColor
import net.minecraft.world.level.block.BeaconBeamBlock

abstract class StainedGlassSlabBlock extends GlassSlabBlock with BeaconBeamBlock{
  var color: DyeColor
  def this(color: DyeColor){
    this()
    this.color = color
  }
  override def getColor: DyeColor = color
}