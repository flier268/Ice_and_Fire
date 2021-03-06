package com.github.alexthe666.iceandfire.enums;

import com.github.alexthe666.iceandfire.entity.EntityDragonBase;
import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import net.minecraft.util.ResourceLocation;

public enum EnumDragonTextures {
    VARIANT1("red_", "blue_"),
    VARIANT2("green_", "white_"),
    VARIANT3("bronze_", "sapphire_"),
    VARIANT4("gray_", "silver_");

    public final ResourceLocation FIRESTAGE1TEXTURE;
    public final ResourceLocation FIRESTAGE2TEXTURE;
    public final ResourceLocation FIRESTAGE3TEXTURE;
    public final ResourceLocation FIRESTAGE4TEXTURE;
    public final ResourceLocation FIRESTAGE5TEXTURE;
    public final ResourceLocation ICESTAGE1TEXTURE;
    public final ResourceLocation ICESTAGE2TEXTURE;
    public final ResourceLocation ICESTAGE3TEXTURE;
    public final ResourceLocation ICESTAGE4TEXTURE;
    public final ResourceLocation ICESTAGE5TEXTURE;
    public final ResourceLocation FIRESTAGE1SLEEPINGTEXTURE;
    public final ResourceLocation FIRESTAGE2SLEEPINGTEXTURE;
    public final ResourceLocation FIRESTAGE3SLEEPINGTEXTURE;
    public final ResourceLocation FIRESTAGE4SLEEPINGTEXTURE;
    public final ResourceLocation FIRESTAGE5SLEEPINGTEXTURE;
    public final ResourceLocation ICESTAGE1SLEEPINGTEXTURE;
    public final ResourceLocation ICESTAGE2SLEEPINGTEXTURE;
    public final ResourceLocation ICESTAGE3SLEEPINGTEXTURE;
    public final ResourceLocation ICESTAGE4SLEEPINGTEXTURE;
    public final ResourceLocation ICESTAGE5SLEEPINGTEXTURE;
    public final ResourceLocation FIRESTAGE1EYESTEXTURE;
    public final ResourceLocation FIRESTAGE2EYESTEXTURE;
    public final ResourceLocation FIRESTAGE3EYESTEXTURE;
    public final ResourceLocation FIRESTAGE4EYESTEXTURE;
    public final ResourceLocation FIRESTAGE5EYESTEXTURE;
    public final ResourceLocation ICESTAGE1EYESTEXTURE;
    public final ResourceLocation ICESTAGE2EYESTEXTURE;
    public final ResourceLocation ICESTAGE3EYESTEXTURE;
    public final ResourceLocation ICESTAGE4EYESTEXTURE;
    public final ResourceLocation ICESTAGE5EYESTEXTURE;
    public final ResourceLocation FIRESTAGE1SKELETONTEXTURE;
    public final ResourceLocation FIRESTAGE2SKELETONTEXTURE;
    public final ResourceLocation FIRESTAGE3SKELETONTEXTURE;
    public final ResourceLocation FIRESTAGE4SKELETONTEXTURE;
    public final ResourceLocation FIRESTAGE5SKELETONTEXTURE;
    public final ResourceLocation ICESTAGE1SKELETONTEXTURE;
    public final ResourceLocation ICESTAGE2SKELETONTEXTURE;
    public final ResourceLocation ICESTAGE3SKELETONTEXTURE;
    public final ResourceLocation ICESTAGE4SKELETONTEXTURE;
    public final ResourceLocation ICESTAGE5SKELETONTEXTURE;

    private EnumDragonTextures(String fireVariant, String iceVariant) {
        FIRESTAGE1TEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "1.png");
        FIRESTAGE2TEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "2.png");
        FIRESTAGE3TEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "3.png");
        FIRESTAGE4TEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "4.png");
        FIRESTAGE5TEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "5.png");
        FIRESTAGE1SLEEPINGTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "1_sleeping.png");
        FIRESTAGE2SLEEPINGTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "2_sleeping.png");
        FIRESTAGE3SLEEPINGTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "3_sleeping.png");
        FIRESTAGE4SLEEPINGTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "4_sleeping.png");
        FIRESTAGE5SLEEPINGTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "5_sleeping.png");
        FIRESTAGE1EYESTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "1_eyes.png");
        FIRESTAGE2EYESTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "2_eyes.png");
        FIRESTAGE3EYESTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "3_eyes.png");
        FIRESTAGE4EYESTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "4_eyes.png");
        FIRESTAGE5EYESTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + fireVariant + "5_eyes.png");
        FIRESTAGE1SKELETONTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/fire_skeleton_1.png");
        FIRESTAGE2SKELETONTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/fire_skeleton_2.png");
        FIRESTAGE3SKELETONTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/fire_skeleton_3.png");
        FIRESTAGE4SKELETONTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/fire_skeleton_4.png");
        FIRESTAGE5SKELETONTEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/fire_skeleton_5.png");
        ICESTAGE1TEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "1.png");
        ICESTAGE2TEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "2.png");
        ICESTAGE3TEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "3.png");
        ICESTAGE4TEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "4.png");
        ICESTAGE5TEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "5.png");
        ICESTAGE1SLEEPINGTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "1_sleeping.png");
        ICESTAGE2SLEEPINGTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "2_sleeping.png");
        ICESTAGE3SLEEPINGTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "3_sleeping.png");
        ICESTAGE4SLEEPINGTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "4_sleeping.png");
        ICESTAGE5SLEEPINGTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "5_sleeping.png");
        ICESTAGE1EYESTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "1_eyes.png");
        ICESTAGE2EYESTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "2_eyes.png");
        ICESTAGE3EYESTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "3_eyes.png");
        ICESTAGE4EYESTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "4_eyes.png");
        ICESTAGE5EYESTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + iceVariant + "5_eyes.png");
        ICESTAGE1SKELETONTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/ice_skeleton_1.png");
        ICESTAGE2SKELETONTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/ice_skeleton_2.png");
        ICESTAGE3SKELETONTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/ice_skeleton_3.png");
        ICESTAGE4SKELETONTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/ice_skeleton_4.png");
        ICESTAGE5SKELETONTEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/ice_skeleton_5.png");
    }


    public static ResourceLocation getTextureFromDragon(EntityDragonBase dragon) {
        if (dragon instanceof EntityIceDragon) {
            return getIceDragonTextures(dragon);
        }else{
            return getFireDragonTextures(dragon);
        }
    }

    public static ResourceLocation getEyeTextureFromDragon(EntityDragonBase dragon) {
        EnumDragonTextures textures = getDragonEnum(dragon);
        if (dragon instanceof EntityIceDragon) {
            switch (dragon.getDragonStage()) {
                case 1:
                    return textures.ICESTAGE1EYESTEXTURE;
                case 2:
                    return textures.ICESTAGE2EYESTEXTURE;
                case 3:
                    return textures.ICESTAGE3EYESTEXTURE;
                case 4:
                    return textures.ICESTAGE4EYESTEXTURE;
                case 5:
                    return textures.ICESTAGE5EYESTEXTURE;
                default:
                    return textures.ICESTAGE4EYESTEXTURE;
            }
        }else{
            switch (dragon.getDragonStage()) {
                case 1:
                    return textures.FIRESTAGE1EYESTEXTURE;
                case 2:
                    return textures.FIRESTAGE2EYESTEXTURE;
                case 3:
                    return textures.FIRESTAGE3EYESTEXTURE;
                case 4:
                    return textures.FIRESTAGE4EYESTEXTURE;
                case 5:
                    return textures.FIRESTAGE5EYESTEXTURE;
                default:
                    return textures.FIRESTAGE4EYESTEXTURE;
            }
        }
    }

    private static ResourceLocation getFireDragonTextures(EntityDragonBase dragon) {
        EnumDragonTextures textures = getDragonEnum(dragon);
        if (dragon.isModelDead()) {
            if (dragon.getDeathStage() >= (dragon.getAgeInDays() / 5) / 2) {
                switch (dragon.getDragonStage()) {
                    case 1:
                        return textures.FIRESTAGE1SKELETONTEXTURE;
                    case 2:
                        return textures.FIRESTAGE2SKELETONTEXTURE;
                    case 3:
                        return textures.FIRESTAGE3SKELETONTEXTURE;
                    case 4:
                        return textures.FIRESTAGE4SKELETONTEXTURE;
                    case 5:
                        return textures.FIRESTAGE5SKELETONTEXTURE;
                    default:
                        return textures.FIRESTAGE4SKELETONTEXTURE;
                }
            } else {
                switch (dragon.getDragonStage()) {
                    case 1:
                        return textures.FIRESTAGE1SLEEPINGTEXTURE;
                    case 2:
                        return textures.FIRESTAGE2SLEEPINGTEXTURE;
                    case 3:
                        return textures.FIRESTAGE3SLEEPINGTEXTURE;
                    case 4:
                        return textures.FIRESTAGE4SLEEPINGTEXTURE;
                    case 5:
                        return textures.FIRESTAGE5SLEEPINGTEXTURE;
                    default:
                        return textures.FIRESTAGE4SLEEPINGTEXTURE;
                }
            }
        }
        if (dragon.isSleeping() || dragon.isBlinking()) {
            switch (dragon.getDragonStage()) {
                case 1:
                    return textures.FIRESTAGE1SLEEPINGTEXTURE;
                case 2:
                    return textures.FIRESTAGE2SLEEPINGTEXTURE;
                case 3:
                    return textures.FIRESTAGE3SLEEPINGTEXTURE;
                case 4:
                    return textures.FIRESTAGE4SLEEPINGTEXTURE;
                case 5:
                    return textures.FIRESTAGE5SLEEPINGTEXTURE;
                default:
                    return textures.FIRESTAGE4SLEEPINGTEXTURE;
            }
        } else {
            switch (dragon.getDragonStage()) {
                case 1:
                    return textures.FIRESTAGE1TEXTURE;
                case 2:
                    return textures.FIRESTAGE2TEXTURE;
                case 3:
                    return textures.FIRESTAGE3TEXTURE;
                case 4:
                    return textures.FIRESTAGE4TEXTURE;
                case 5:
                    return textures.FIRESTAGE5TEXTURE;
                default:
                    return textures.FIRESTAGE4TEXTURE;
            }
        }
    }

    private static ResourceLocation getIceDragonTextures(EntityDragonBase dragon) {
        EnumDragonTextures textures = getDragonEnum(dragon);
        if (dragon.isModelDead()) {
            if (dragon.getDeathStage() >= (dragon.getAgeInDays() / 5) / 2) {
                switch (dragon.getDragonStage()) {
                    case 1:
                        return textures.ICESTAGE1SKELETONTEXTURE;
                    case 2:
                        return textures.ICESTAGE2SKELETONTEXTURE;
                    case 3:
                        return textures.ICESTAGE3SKELETONTEXTURE;
                    case 4:
                        return textures.ICESTAGE4SKELETONTEXTURE;
                    case 5:
                        return textures.ICESTAGE5SKELETONTEXTURE;
                    default:
                        return textures.ICESTAGE4SKELETONTEXTURE;
                }
            } else {
                switch (dragon.getDragonStage()) {
                    case 1:
                        return textures.ICESTAGE1SLEEPINGTEXTURE;
                    case 2:
                        return textures.ICESTAGE2SLEEPINGTEXTURE;
                    case 3:
                        return textures.ICESTAGE3SLEEPINGTEXTURE;
                    case 4:
                        return textures.ICESTAGE4SLEEPINGTEXTURE;
                    case 5:
                        return textures.ICESTAGE5SLEEPINGTEXTURE;
                    default:
                        return textures.ICESTAGE4SLEEPINGTEXTURE;
                }
            }
        }
        if (dragon.isSleeping() || dragon.isBlinking()) {
            switch (dragon.getDragonStage()) {
                case 1:
                    return textures.ICESTAGE1SLEEPINGTEXTURE;
                case 2:
                    return textures.ICESTAGE2SLEEPINGTEXTURE;
                case 3:
                    return textures.ICESTAGE3SLEEPINGTEXTURE;
                case 4:
                    return textures.ICESTAGE4SLEEPINGTEXTURE;
                case 5:
                    return textures.ICESTAGE5SLEEPINGTEXTURE;
                default:
                    return textures.ICESTAGE4SLEEPINGTEXTURE;
            }
        } else {
            switch (dragon.getDragonStage()) {
                case 1:
                    return textures.ICESTAGE1TEXTURE;
                case 2:
                    return textures.ICESTAGE2TEXTURE;
                case 3:
                    return textures.ICESTAGE3TEXTURE;
                case 4:
                    return textures.ICESTAGE4TEXTURE;
                case 5:
                    return textures.ICESTAGE5TEXTURE;
                default:
                    return textures.ICESTAGE4TEXTURE;
            }
        }
    }

    private static EnumDragonTextures getDragonEnum(EntityDragonBase dragon) {
        switch (dragon.getVariant()) {
            default:
                return VARIANT1;
            case 1:
                return VARIANT2;
            case 2:
                return VARIANT3;
            case 3:
                return VARIANT4;
        }
    }

    public enum Armor{
        EMPTY(""),
        ARMORBODY1("armor_body_1"),
        ARMORBODY2("armor_body_2"),
        ARMORBODY3("armor_body_3"),
        ARMORHEAD1("armor_head_1"),
        ARMORHEAD2("armor_head_2"),
        ARMORHEAD3("armor_head_3"),
        ARMORNECK1("armor_neck_1"),
        ARMORNECK2("armor_neck_2"),
        ARMORNECK3("armor_neck_3"),
        ARMORTAIL1("armor_tail_1"),
        ARMORTAIL2("armor_tail_2"),
        ARMORTAIL3("armor_tail_3");

        public final ResourceLocation FIRETEXTURE;
        public final ResourceLocation ICETEXTURE;

        private Armor(String resource){
            if(!resource.isEmpty()){
                FIRETEXTURE = new ResourceLocation("iceandfire:textures/models/firedragon/" + resource + ".png");
                ICETEXTURE = new ResourceLocation("iceandfire:textures/models/icedragon/" + resource + ".png");
            }else{
                FIRETEXTURE = null;
                ICETEXTURE = null;
            }
        }

        public static Armor getArmorForDragon(EntityDragonBase dragon, int slot){
            int armor = dragon.getArmorInSlot(slot);
            switch(slot){
                case 1:
                    //neck
                    switch(armor){
                        default:
                            return EMPTY;
                        case 1:
                            return ARMORNECK1;
                        case 2:
                            return ARMORNECK2;
                        case 3:
                            return ARMORNECK3;
                    }
                case 2:
                    //body
                    switch(armor){
                        default:
                            return EMPTY;
                        case 1:
                            return ARMORBODY1;
                        case 2:
                            return ARMORBODY2;
                        case 3:
                            return ARMORBODY3;
                    }
                case 3:
                    //tail
                    switch(armor){
                        default:
                            return EMPTY;
                        case 1:
                            return ARMORTAIL1;
                        case 2:
                            return ARMORTAIL2;
                        case 3:
                            return ARMORTAIL3;
                    }
                default:
                    //head
                    switch(armor){
                        default:
                            return EMPTY;
                        case 1:
                            return ARMORHEAD1;
                        case 2:
                            return ARMORHEAD2;
                        case 3:
                            return ARMORHEAD3;
                    }

            }
        }
    }
}
