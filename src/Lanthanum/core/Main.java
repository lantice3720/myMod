package Lanthanum.core;

import arc.Events;
import mindustry.content.MyBlocks;
import mindustry.game.EventType.*;
import mindustry.mod.Mod;
import arc.*;
import arc.func.*;
import arc.input.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.ctype.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.mod.Mods.*;
import mindustry.net.*;
import mindustry.ui.*;
import mindustry.ui.dialogs.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
// import Lanthanum.content.*;

import static mindustry.Vars.*;

public class Main extends Mod {

    public static Seq<Block> visibleBlockList = new Seq<Block>();

    private final ContentList[] myContent = {
            new MyBlocks()
    };

    @Override
    public void init(){
        Events.on(ClientLoadEvent.class, e -> {
        });

        Events.on(WorldLoadEvent.class, e -> {
        });
    }

    @Override
    public void loadContent(){

    }


}
