package Builder_Deisgn_Pattern.client;

import Builder_Deisgn_Pattern.builder3.ZodiacDTO;
import Builder_Deisgn_Pattern.builder3.ZodiacDTOBuilder;

public class Builder3 {
    public static void main(String[] args) {
        ZodiacDTO dto = new ZodiacDTOBuilder()
                .withSunSign("Aries")
                .withDuration("Today")
                .withIsShowLoader(true)
                .withIsDebuggable(false)
                .build();
        System.out.println("dto -> " + dto.getSunSign() + " " + dto.getDuration() + " " + dto.getIsDebuggable() + " " + dto.getIsShowLoader());
    }
}
