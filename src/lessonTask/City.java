package lessonTask;

public enum City {
    BISHKEK("Kooz jana salkyn"),
    STANBUL("Suluu Shaar "),
    MOSCOW("Suuk "),
    TASHKENT("Elderi sylyk "),
    ABUDABI("Oto kooz shaar ");

    private  String ozgocholuktoru;

    City(String ozgocholuktoru) {
        this.ozgocholuktoru = ozgocholuktoru;
    }

    public String getOzgocholuktoru() {
        return ozgocholuktoru;
    }
}
