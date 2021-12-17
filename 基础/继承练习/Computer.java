package etu.extendsExercise;

public class Computer {
    private String Cpu;
    private String mémoire;
    private String disque_dur;

    public Computer(String cpu, String mémoire, String disque_dur) {
        Cpu = cpu;
        this.mémoire = mémoire;
        this.disque_dur = disque_dur;
    }
    public String getDetail(){
        return "Cpu = " + getCpu() + " mémoire = " + getMémoire() + "disque_dur = " + getDisque_dur();
    }

    public String getCpu() {
        return Cpu;
    }

    public void setCpu(String cpu) {
        Cpu = cpu;
    }

    public String getMémoire() {
        return mémoire;
    }

    public void setMémoire(String mémoire) {
        this.mémoire = mémoire;
    }

    public String getDisque_dur() {
        return disque_dur;
    }

    public void setDisque_dur(String disque_dur) {
        this.disque_dur = disque_dur;
    }
}

