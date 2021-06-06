public interface ItemStats {
    //Axe Types &  Stats//
    //Small Axe , Axe , Broad Axe//
    //Material types//
    //Iron , Bronze , Steel//
    //Stat Types//
    //Damage , Block Power , Range , Value , Weight//

    int ironSmallAxeDamage = 4;
    int ironSmallAxeBlockPower = 0;
    int ironSmallAxeRange = 1;
    int ironSmallAxeValue = 2;
    int ironSmallAxeWeight = 2;

    int ironAxeDamage = 6;
    int ironAxeBlockPower = 4;
    int ironAxeRange = 3;
    int ironAxeValue = 3;
    int ironAxeWeight = 3;

    int ironBroadAxeDamage = 8;
    int ironBroadAxeBlockPower = 6;
    int ironBroadAxeRange = 5;
    int ironBroadAxeValue = 4;
    int ironBroadAxeWeight = 4;

    //-----------------------------------------------------//

    int bronzeSmallAxeDamage = 5;
    int bronzeSmallAxeBlockPower = 0;
    int bronzeSmallAxeRange = 1;
    int bronzeSmallAxeValue = 3;
    int bronzeSmallAxeWeight = 2;

    int bronzeAxeDamage = 7;
    int bronzeAxeBlockPower = 4;
    int bronzeAxeRange = 3;
    int bronzeAxeValue = 4;
    int bronzeAxeWeight = 3;

    int bronzeBroadAxeDamage = 9;
    int bronzeBroadAxeBlockPower = 6;
    int bronzeBroadAxeRange = 5;
    int bronzeBroadAxeValue = 5;
    int bronzeBroadAxeWeight = 4;

    //-----------------------------------------------------//

    int steelSmallAxeDamage = 6;
    int steelSmallAxeBlockPower = 0;
    int steelSmallAxeRange = 1;
    int steelSmallAxeValue = 5;
    int steelSmallAxeWeight = 2;

    int steelAxeDamage = 8;
    int steelAxeBlockPower = 4;
    int steelAxeRange = 3;
    int steelAxeValue = 5;
    int steelAxeWeight = 3;

    int steelBroadAxeDamage = 10;
    int steelBroadAxeBlockPower = 6;
    int steelBroadAxeRange = 5;
    int steelBroadAxeValue = 6;
    int steeleBroadAxeWeight = 4;

    //-----------------------------------------------------//

    //Sword Types & Stats//
    //Dagger , Short Sword , Long Sword//
    //Material Types//
    //Iron , Bronze , Steel//
    //Stat Types//
    //Damage , Block Power , Range , Value , Weight//

    int ironDaggerDamage = 3;
    int ironDaggerBlockPower = 0;
    int ironDaggerRange = 1;
    int ironDaggerValue = 1;
    int ironDaggerWeight = 1;

    int ironShortSwordDamage = 5;
    int ironShortSwordBlockPower = 5;
    int ironShortSwordRange = 3;
    int ironShortSwordValue = 3;
    int ironShortSwordWeight = 3;

    int ironLongSwordDamage = 7;
    int ironLongSwordBlockPower = 7;
    int ironLongSwordRange = 5;
    int ironLongSwordValue = 4;
    int ironLongSwordWeight = 4;

    //-----------------------------------------------------//

    int bronzeDaggerDamage = 4;
    int bronzeDaggerBlockPower = 0;
    int bronzeDaggerRange = 1;
    int bronzeDaggerValue = 2;
    int bronzeDaggerWeight = 1;

    int bronzeShortSwordDamage = 6;
    int bronzeShortSwordBlockPower = 5;
    int bronzeShortSwordRange = 3;
    int bronzeShortSwordValue = 4;
    int bronzeShortSwordWeight = 3;

    int bronzeLongSwordDamage = 8;
    int bronzeLongSwordBlockPower = 7;
    int bronzeLongSwordRange = 5;
    int bronzeLongSwordValue = 5;
    int bronzeLongSwordWeight = 4;

    //-----------------------------------------------------//

    int steelDaggerDamage = 5;
    int steelDaggerBlockPower = 0;
    int steelDaggerRange = 1;
    int steelDaggerValue = 3;
    int steelDaggerWeight = 1;

    int steelShortSwordDamage = 7;
    int steelShortSwordBlockPower = 5;
    int steelShortSwordRange = 3;
    int steelShortSwordValue = 5;
    int steelShortSwordWeight = 3;

    int steelLongSwordDamage = 9;
    int steelLongSwordBlockPower = 7;
    int steelLongSwordRange = 5;
    int steelLongSwordValue = 6;
    int steelLongSwordWeight = 4;

    //-----------------------------------------------------//

    //Bow Types & Stats//
    //Short Bow , Long Bow , Composite Bow//
    //Stat Types//
    //Damage , Block Power , Range , Value , Weight//

    int shortBowDamage = 5;
    int shortBowBlockPower = 0;
    int shortBowRange = 8;
    int shortBowValue = 3;
    int shortBowWeight = 2;

    int longBowDamage = 7;
    int longBowBlockPower = 0;
    int longBowRange = 10;
    int longBowValue = 5;
    int longBowWeight = 3;

    int compositeBowDamage = 10;
    int compositeBowBlockPower = 0;
    int compositeBowRange = 12;
    int compositeBowValue = 7;
    int compositeBowWeight = 4;

    //-----------------------------------------------------//

    //Armor Types & Stats//
    //Light Clothing , Leather Armor , Chain Armor//
    //Stat Types//
    //Protection , Value , Weight//

    int lightClothingProtection = 3;
    int lightClothingValue = 2;
    int lightClothingWeight = 2;

    int leatherArmorProtection = 5;
    int leatherArmorValue = 4;
    int leatherArmorWeight = 3;

    int chainArmorProtection = 7;
    int chainArmorValue = 6;
    int chainArmorWeight = 5;

    int rareHeroArmorProtection = 9;
    int rareHeroArmorValue = 20;
    int rareHeroArmorWeight = 7;


    // Variable logic //
    // Range //
    // if weapon range => enemy distance , weapon damage should work for certain //
    // if weapon range is < enemy distance , weapon damage should work with %50 possibility //
    // Armor //
    // if protection == 3 , enemies can deal damage to player with %80 possibility //
    // if protection == 5 , enemies can deal damage to player with %70 possibility //
    // if protection == 7 , enemies can deal damage to player with %60 possibility //
    // if protection == 9 , enemies can deal damage to player with %40 possibility //

}
