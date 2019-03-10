package weekend02.coinpo;

public class Entertainment {
    private double volume=0;
    private boolean play=false;
    private int station;

    public boolean turnOnTurnOf(){
        play=(!play);
        return play;
    }

    public Entertainment(double volume, int station) {
        this.volume = volume;
        this.station = station;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setStation(int station) {
        this.station = station;
    }

    public double getVolume() {
        return volume;
    }

    public int getStation() {
        return this.station;
    }

    public boolean isPlay() {
        return play;
    }

    @Override
    public String toString() {
        if (play==true) {
            return "Radio: {volume=" + volume + ", station=" + station+'}';
        }
        else return "Radio is off.";
    }


}
