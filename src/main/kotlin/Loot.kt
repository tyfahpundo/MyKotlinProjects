enum class LootType{
    PORTION,RING,ARMOUR
}

class Loot(val name: String, val type: LootType, val value: Double) {
}