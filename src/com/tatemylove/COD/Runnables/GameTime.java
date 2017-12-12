package com.tatemylove.COD.Runnables;

import com.tatemylove.COD.Arenas.BaseArena;
import com.tatemylove.COD.Arenas.TDM;
import org.bukkit.scheduler.BukkitRunnable;

public class GameTime extends BukkitRunnable {
    TDM tdm;
    MainRunnable mainRunnable;

    public GameTime(TDM t, MainRunnable mr){
        mainRunnable = mr;
        tdm = t;
    }

    private int timeleft = 600;
    @Override
    public void run() {
        if(BaseArena.states == BaseArena.ArenaStates.Started){
            if(timeleft == 0){
                tdm.endTDM();
                mainRunnable.stopGameTime();
            }
        }
        timeleft -=1;
    }
}