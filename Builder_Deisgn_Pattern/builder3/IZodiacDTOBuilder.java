package Builder_Deisgn_Pattern.builder3;

public interface IZodiacDTOBuilder {
    IZodiacDTOBuilder withSunSign(String sunSign);

    IZodiacDTOBuilder withDuration(String duration);

    IZodiacDTOBuilder withIsShowLoader(boolean isShowLoader);

    IZodiacDTOBuilder withIsDebuggable(boolean isDebuggable);

    ZodiacDTO build();


}
