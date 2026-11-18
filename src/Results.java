public class Results {

    private String funcionName;
    private long duration;
    private String sample;
    
    public Results(String funcionName, long duration, String sample) {
        this.funcionName = funcionName;
        this.duration = duration;
        this.sample = sample;
    }

    public String getFuncionName() {
        return funcionName;
    }

    public long getDuration() {
        return duration;
    }

    public String getSample() {
        return sample;
    }

    public void setFuncionName(String funcionName) {
        this.funcionName = funcionName;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    @Override 
    public String toString() {
        long segundos = duration / 10;
        return "Funcion: " + funcionName + ", Duracion: " + segundos + " segundos, Sample: " + sample;     
    }


    
}
