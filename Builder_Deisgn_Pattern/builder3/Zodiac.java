package Builder_Deisgn_Pattern.builder3;

public class Zodiac implements ZodiacDTO {
    private String sunSign, duration;
    private boolean isShowLoader = false, isDebuggable = false;

    public Zodiac(String sunSign, String duration, boolean isShowLoader, boolean isDebuggable) {
        this.sunSign = sunSign;
        this.duration = duration;
        this.isShowLoader = isShowLoader;
        this.isDebuggable = isDebuggable;
    }

    @Override
    public String getSunSign() {
        return this.sunSign;
    }

    @Override
    public String getDuration() {
        return this.duration;
    }

    @Override
    public Boolean getIsShowLoader() {
        return this.isShowLoader;
    }

    @Override
    public Boolean getIsDebuggable() {
        return this.isDebuggable;
    }
}
