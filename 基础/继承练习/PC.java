package etu.extendsExercise;

class PC extends Computer{
    private String marque;

    public PC(String cpu, String mémoire, String disque_dur, String marque) {
        super(cpu, mémoire, disque_dur);
        this.marque = marque;
    }

    public String printInfo(){
        return getDetail() + " marque = " + marque;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
