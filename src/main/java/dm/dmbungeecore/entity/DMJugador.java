package dm.dmbungeecore.entity;

import net.md_5.bungee.api.connection.ProxiedPlayer;

public class DMJugador {

    private final String name;
    private final ProxiedPlayer player;

    private int chg_wins;
    private int chg_kills;
    private int chg_played;

    public DMJugador(ProxiedPlayer player) {
        this.player = player;
        this.name = this.player.getName();
    }

    public String getName() {
        return name;
    }

    public ProxiedPlayer getPlayer() {
        return player;
    }

    public int getChg_wins() {
        return chg_wins;
    }

    public void setChg_wins(int chg_wins) {
        this.chg_wins = chg_wins;
    }

    public int getChg_kills() {
        return chg_kills;
    }

    public void setChg_kills(int chg_kills) {
        this.chg_kills = chg_kills;
    }

    public int getChg_played() {
        return chg_played;
    }

    public void setChg_played(int chg_played) {
        this.chg_played = chg_played;
    }

    public int getChg_Deaths(){
        return getChg_played() - getChg_wins();
    }
    public double getKDR() {
        if (getChg_Deaths() == 0) {
            return getChg_kills();
        } else {
            return (double) getChg_kills() / getChg_Deaths();
        }
    }

}
