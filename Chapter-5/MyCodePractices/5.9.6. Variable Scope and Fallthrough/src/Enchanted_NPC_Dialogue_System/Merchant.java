package Enchanted_NPC_Dialogue_System;

final class Merchant implements NPC {
    private final String shopType;

    public Merchant(String shopType) {
        this.shopType = shopType;
    }

    public String getShopType() {
        return shopType;
    }

    @Override
    public String toString() {
        return "Merchant (" + shopType + ")";
    }
}
