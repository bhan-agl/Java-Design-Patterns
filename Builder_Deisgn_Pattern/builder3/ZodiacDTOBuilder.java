package Builder_Deisgn_Pattern.builder3;

public class ZodiacDTOBuilder implements IZodiacDTOBuilder {
    private String sunSign, duration;
    private boolean isShowLoader = false, isDebuggable = false;
    private ZodiacDTO dto;

    @Override
    public IZodiacDTOBuilder withSunSign(String sunSign) {
        this.sunSign = sunSign;
        return this;
    }

    @Override
    public IZodiacDTOBuilder withDuration(String duration) {
        this.duration = duration;
        return this;

    }

    @Override
    public IZodiacDTOBuilder withIsShowLoader(boolean isShowLoader) {
        this.isShowLoader = isShowLoader;
        return this;
    }

    @Override
    public IZodiacDTOBuilder withIsDebuggable(boolean isDebuggable) {
        this.isDebuggable = isDebuggable;
        return this;
    }

    @Override
    public ZodiacDTO build() {
        this.dto = new Zodiac(this.sunSign, this.duration, this.isShowLoader, this.isDebuggable);
        return dto;
    }
}
